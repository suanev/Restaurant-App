import { async, ComponentFixture, TestBed } from '@angular/core/testing';
import { IonicModule } from '@ionic/angular';
import { Search } from './search.page';

describe('Search', () => {
  let component: Search;
  let fixture: ComponentFixture<Search>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [Search],
      imports: [IonicModule.forRoot()]
    }).compileComponents();

    fixture = TestBed.createComponent(Search);
    component = fixture.componentInstance;
    fixture.detectChanges();
  }));

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
