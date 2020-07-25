import { Injectable } from "@angular/core";
import { HttpEvent, HttpInterceptor, HttpHandler, HttpRequest, HTTP_INTERCEPTORS } from "@angular/common/http";
import { Observable, throwError } from "rxjs";
import { catchError } from 'rxjs/operators';
import { StorageService } from 'src/service/storage.service';
 
 
@Injectable()
export class AuthInterceptor implements HttpInterceptor{
 
    constructor(private storage: StorageService){ }
 
    intercept(req: HttpRequest<any>, next: HttpHandler): Observable<HttpEvent<any>>{
        let localUser = this.storage.getLocalUser();

        if(localUser) {
            const authReq = req.clone({headers: req.headers.set('Authorization', `Bearer ${localUser.token}`)});
            return next.handle(authReq);
        }
        else {
            return next.handle(req);
        }
    }
 
 
handle403(){
        this.storage.setLocalUser(null);
    }
 
}
 
 
export const AuthInterceptorProvider = {
    provide: HTTP_INTERCEPTORS,
    useClass: AuthInterceptor,
    multi: true,
};