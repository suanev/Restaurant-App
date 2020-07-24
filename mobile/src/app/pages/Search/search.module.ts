import { IonicModule } from '@ionic/angular';
import { RouterModule } from '@angular/router';
import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { Search } from './search.page';

import { SearchRoutingModule } from './search-routing.module';

@NgModule({
  imports: [
    IonicModule,
    CommonModule,
    FormsModule,
    SearchRoutingModule
  ],
  declarations: [Search]
})
export class SearchModule {}
