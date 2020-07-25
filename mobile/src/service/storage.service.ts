import { Injectable } from "@angular/core";
import { HttpClient } from "@angular/common/http";
import { STORAGE_KEYS } from "../interfaces/storage_keys";
import { User } from 'src/interfaces/user';

@Injectable({
    providedIn: 'root'
})
export class StorageService {

    private readonly url = 'http://localhost:8080';

    constructor(private http: HttpClient) { }

    getLocalUser(): User {
        let user = localStorage.getItem(STORAGE_KEYS.localUser);
        if(user === null) return null; else return JSON.parse(user);
    }

    setLocalUser(user: User) {
        if(user === null) {
            localStorage.removeItem(STORAGE_KEYS.localUser);
        } else {
            localStorage.setItem(STORAGE_KEYS.localUser, JSON.stringify(user));
        }
    }
}