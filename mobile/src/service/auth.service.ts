import { Injectable } from '@angular/core';
import { Credenciais } from 'src/interfaces/credenciais';
import { HttpClient } from '@angular/common/http';
import { User } from 'src/interfaces/user';
import { StorageService } from './storage.service';
import { JwtHelperService } from "@auth0/angular-jwt";

@Injectable({
    providedIn: 'root'
})
export class AuthService {

    private readonly url = 'http://localhost:8080';

    jwtHelper: JwtHelperService = new JwtHelperService();

    constructor(private http: HttpClient, private storage: StorageService) { }

    authenticate(creds: Credenciais) {
        return this.http.post(
            `${this.url}/login`,
            creds,
            {
                observe: 'response',
                responseType: 'text'
            }
        );
    }

    successfulLogin(authorizationValue: string) {
        let tok = authorizationValue.substring(7);
        let user: User = {
            token: tok,
            email: this.jwtHelper.decodeToken(tok).sub
        };
        this.storage.setLocalUser(user);
    }

    logout() {
        this.storage.setLocalUser(null);
    }
}