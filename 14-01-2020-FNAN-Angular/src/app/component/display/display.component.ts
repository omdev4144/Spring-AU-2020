import { Component, OnInit } from '@angular/core';
import { ConnectingService } from 'src/app/providers/connecting.service';

@Component({
  selector: 'app-display',
  templateUrl: './display.component.html',
  styleUrls: ['./display.component.scss']
})
export class DisplayComponent implements OnInit {

  constructor(public connectSer: ConnectingService) { }
  rec_array;
  ngOnInit() {
    this.rec_array = this.connectSer.getData();
    console.log(this.rec_array);
  }

}
