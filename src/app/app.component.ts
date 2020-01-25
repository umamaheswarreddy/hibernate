import { Component } from '@angular/core';
import { ɵNgClassR2Impl } from '@angular/common';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  n1:number=null;
  n2:number=null;
  result:number=null;
  
  public add():number
  {
    this.result=this.n1+this.n2;
    return this.result;
  }
  public sub():number
  {
    this.result=this.n1-this.n2;
    return this.result;
  }
  public mul():number
  {
    this.result=this.n1*this.n2;
    return this.result;
  }
  public div():number
  {
    this.result=this.n1/this.n2;
    return this.result;
  }
 
}

