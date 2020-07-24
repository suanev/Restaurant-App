import { async, ComponentFixture, TestBed } from '@angular/core/testing';
import { IonicModule } from '@ionic/angular';

import { Cart } from './cart.page';

describe('Cart', () => {
  let component: Cart;
  let fixture: ComponentFixture<Cart>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [Cart],
      imports: [IonicModule.forRoot()]
    }).compileComponents();

    fixture = TestBed.createComponent(Cart);
    component = fixture.componentInstance;
    fixture.detectChanges();
  }));

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
