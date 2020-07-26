import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Estado } from 'src/interfaces/estado';

@Injectable({
    providedIn: 'root'
})
export class EstadoService {

    private readonly url = 'http://localhost:8080';

    constructor(public http: HttpClient) {
    }

    findAll() {
        return this.http.get<Estado[]>(`${this.url}/estados`);
    }
}