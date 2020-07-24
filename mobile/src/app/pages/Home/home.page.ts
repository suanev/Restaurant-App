import { Component, OnInit } from '@angular/core';
import { CategoriaService } from "../../../service/categoria.service";
import { Categoria } from 'src/interfaces/categoria';


@Component({
  selector: 'app-home',
  templateUrl: 'home.page.html',
  styleUrls: ['home.page.scss']
})
export class Home implements OnInit{

  constructor(private service: CategoriaService) {
    
  }

  slideOpts = {
    speed: 400,
    scrollbar: true
  };

  categorias: Categoria[];

  ngOnInit(): void {
    this.service.getCategorias()
      .subscribe(dados => this.categorias = dados);
  }

}
