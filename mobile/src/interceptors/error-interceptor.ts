import { Injectable } from "@angular/core";
import { HttpEvent, HttpInterceptor, HttpHandler, HttpRequest, HTTP_INTERCEPTORS } from "@angular/common/http";
import { Observable, throwError } from "rxjs";
import { catchError } from 'rxjs/operators';
import { StorageService } from 'src/service/storage.service';
import { AlertController } from '@ionic/angular';
import { FieldMessage } from 'src/interfaces/field_message';


@Injectable()
export class ErrorInterceptor implements HttpInterceptor {

    constructor(public storage: StorageService, private alertCtrl: AlertController) { }

    intercept(req: HttpRequest<any>, next: HttpHandler): Observable<HttpEvent<any>> {
        return next.handle(req)
            .pipe(
                catchError(error => {
                    if (!error.status) {
                        error = JSON.parse(error);
                    }
                    switch (error.status) {
                        case 401: this.handle401();
                            break;

                        case 403: this.handle403();
                            break;

                        case 422:
                            this.handle422(error);
                            break;

                        default:
                            this.handleDefaultEror(error);
                    }

                    return throwError(error);
                })) as any;
    }


    handle403() {
        this.storage.setLocalUser(null);
    }

    async handle401() {
        const alert = await this.alertCtrl.create({
            header: 'Opss! Algo deu errado!',
            message: 'Email ou senha incorretos',
            backdropDismiss: false,
            buttons: ['Ok']
        });
        await alert.present();
    }

    async handle422(errorObj) {
        let alert = await this.alertCtrl.create({
            header: 'Erro 422: Validação',
            message: this.listErrors(errorObj.errors),
            backdropDismiss: false,
            buttons: ['Ok']
        });
        await alert.present();
    }

    async handleDefaultEror(errorObj) {
        let alert = await this.alertCtrl.create({
            header: `Erro ${errorObj.status} : ${errorObj.error}`,
            message: errorObj.message,
            backdropDismiss: false,
            buttons: ['Ok']
        });
        await alert.present();
    }

    private listErrors(messages: FieldMessage[]): string {
        let s: string = '';
        for (let i = 0; i < messages.length; i++) {
            s = s + '<p><strong>' + messages[i].fieldName + "</strong>: " + messages[i].message + '</p>';
        }
        return s;
    }
}


export const ErrorInterceptorProvider = {
    provide: HTTP_INTERCEPTORS,
    useClass: ErrorInterceptor,
    multi: true,
};