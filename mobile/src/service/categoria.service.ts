import { Injectable } from "@angular/core";
import { HttpClient } from "@angular/common/http";
import { Categoria } from 'src/interfaces/categoria';

@Injectable({
    providedIn: 'root'
})
export class CategoriaService {

    private readonly url = 'http://localhost:8080';

    constructor(private http: HttpClient) { }

    getCategorias() {
        return this.http.get<Categoria[]>(`${this.url}/categorias`);
    }
}