import { Component, OnInit } from '@angular/core';
import { StorageService } from 'src/service/storage.service';
import { Cliente } from 'src/interfaces/cliente';
import { ClienteService } from 'src/service/cliente.service';

@Component({
  selector: 'app-profile',
  templateUrl: './profile.page.html',
  styleUrls: ['./profile.page.scss'],
})
export class ProfilePage implements OnInit {

  cliente: Cliente;

  constructor(private storage: StorageService, private service: ClienteService) { }

  ngOnInit() {
    let localUser = this.storage.getLocalUser();
    if(localUser && localUser.email) {
      this.service.getByEmail(localUser.email).subscribe(response => this.cliente = response);
    }
  }

}
