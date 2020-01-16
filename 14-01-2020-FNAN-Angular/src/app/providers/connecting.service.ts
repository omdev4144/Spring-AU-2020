import { Injectable } from '@angular/core';
import { FormGroup } from '@angular/forms';

@Injectable({
  providedIn: 'root'
})
export class ConnectingService {

  constructor() { }
  fromrec_array=[];

  amInService( fromrec : FormGroup){
    this.fromrec_array.push(fromrec);
    console.log("I am in Service");
    console.log(fromrec);
  }

  getData(){
    console.log("I am in get Data");
    return this.fromrec_array;
  }
}
