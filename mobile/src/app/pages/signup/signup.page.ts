import { Component, OnInit } from '@angular/core';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';
import { CidadeService } from 'src/service/cidade.service';
import { EstadoService } from 'src/service/estado.service';
import { AlertController, NavController } from '@ionic/angular';
import { Estado } from 'src/interfaces/estado';
import { Cidade } from 'src/interfaces/cidade';
import { ClienteService } from 'src/service/cliente.service';

@Component({
  selector: 'app-signup',
  templateUrl: './signup.page.html',
  styleUrls: ['./signup.page.scss'],
})
export class SignupPage implements OnInit {

  formGroup: FormGroup;
  estados: Estado[];
  cidades: Cidade[];

  constructor(
    private navCtrl: NavController,
    private formBuilder: FormBuilder,
    private clienteService: ClienteService,
    private cidadeService: CidadeService,
    private estadoService: EstadoService,
    private alertCtrl: AlertController) {
      this.formGroup = this.formBuilder.group({
        nome: ['', [Validators.required, Validators.minLength(5), Validators.maxLength(120)]],
        email: ['', [Validators.required, Validators.email]],
        tipoCliente : ['', [Validators.required]],
        cpfOuCnpj : ['', [Validators.required, Validators.minLength(11), Validators.maxLength(14)]],
        senha : ['', [Validators.required]],
        logradouro : ['', [Validators.required]],
        numero : ['', [Validators.required]],
        complemento : ['', []],
        bairro : ['', []],
        cep : ['', [Validators.required]],
        telefone1 : ['', [Validators.required]],
        telefone2 : ['', []],
        telefone3 : ['', []],
        estadoId : [null, [Validators.required]],
        cidadeId : [null, [Validators.required]]      
      });
  }

  ngOnInit() {
    this.estadoService.findAll()
      .subscribe(response => {
        this.estados = response;
        this.formGroup.controls.estadoId.setValue(this.estados[0].id);
        this.updateCidades();
      },
        error => { });
  }

  updateCidades() {
    let estado_id = this.formGroup.value.estadoId;
    this.cidadeService.findAll(estado_id)
      .subscribe(response => {
        this.cidades = response;
        this.formGroup.controls.cidadeId.setValue(null);
      },
        error => { });
  }

  signupUser() {
    this.clienteService.insert(this.formGroup.value)
      .subscribe(response => {
        console.log(response)
        this.showInsertOk();
      },
        error => { });
  }

  async showInsertOk() {
    let alert = await this.alertCtrl.create({
      header: 'Sucesso!',
      message: 'Cadastro efetuado com sucesso',
      backdropDismiss: false,
      buttons: ['Ok']
    });
    await alert.present();
  }
}
