import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Cidade } from 'src/interfaces/cidade';


@Injectable({
    providedIn: 'root'
})
export class CidadeService {

    private readonly url = 'http://localhost:8080';


    constructor(public http: HttpClient) {
    }

    findAll(estado_id : string){
        return this.http.get<Cidade[]>(`${this.url}/estados/${estado_id}/cidades`);
    }
}