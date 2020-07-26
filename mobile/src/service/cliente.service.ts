import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { StorageService } from './storage.service';
import { JwtHelperService } from "@auth0/angular-jwt";
import { Cliente } from 'src/interfaces/cliente';

@Injectable({
    providedIn: 'root'
})
export class ClienteService {

    private readonly url = 'http://localhost:8080';

    jwtHelper: JwtHelperService = new JwtHelperService();

    constructor(private http: HttpClient, private storage: StorageService) { }

    getById(id: string) {
        return this.http.get(`${this.url}/clientes/${id}`);
    }

    getByEmail(email: string) {
        let token = this.storage.getLocalUser().token;
        let authHeader = new HttpHeaders({'Authorization': `Bearer ${token}`});

        return this.http.get<Cliente>(
            `${this.url}/clientes/email?value=${email}`,
            {'headers': authHeader});
    }

    insert(cliente : Cliente) {
        return this.http.post(
            `${this.url}/clientes`, 
            cliente,
            { 
                observe: 'response', 
                responseType: 'text'
            }
        ); 
    }

}