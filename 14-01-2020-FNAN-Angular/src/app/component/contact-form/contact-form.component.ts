import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl } from '@angular/forms';
import {  ConnectingService } from '../../providers/connecting.service'

@Component({
  selector: 'contact-form',
  templateUrl: './contact-form.component.html',
  styleUrls: ['./contact-form.component.scss']
})
export class ContactFormComponent implements OnInit {
  
  constructor( public connectSer: ConnectingService ) { }

  userprofileForm = new FormGroup({
    firstname_control : new FormControl(''),
    lastname_control : new FormControl(''),
    age_control : new FormControl(''),
    email_control : new FormControl(''),
    comment_control : new FormControl('')
  })
  
  ngOnInit() {
    
  }

  onSubmit() {
    console.log(this.userprofileForm.value);
    this.connectSer.amInService( this.userprofileForm.value );

  }

}
