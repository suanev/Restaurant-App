import { Component, OnInit } from '@angular/core';
import { NavController } from '@ionic/angular';
import { Credenciais } from 'src/interfaces/credenciais';
import { AuthService } from 'src/service/auth.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.page.html',
  styleUrls: ['./login.page.scss'],
})
export class LoginPage implements OnInit {

  constructor(public navCtrl: NavController, public Auth: AuthService) { }

  credenciais: Credenciais = {
    email: "",
    senha: ""
  };

  ngOnInit() {
  }

  login() {
    this.Auth.authenticate(this.credenciais)
    .subscribe(response => {
      this.Auth.successfulLogin(response.headers.get('Authorization'))
      this.navCtrl.navigateForward('/tabs/home');
    });
    console.log(this.credenciais)
  }

}
