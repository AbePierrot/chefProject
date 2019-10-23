import { Component, OnInit, Input } from '@angular/core';
import { Chef } from '../../Models/chef';


@Component({
  selector: 'app-display-one',
  templateUrl: './display-one.component.html',
  styleUrls: ['./display-one.component.css']
})
export class DisplayOneComponent implements OnInit {

 popUpOpen = false;

 @Input() chef:Chef;

  ngOnInit() {}

  openPopUp() {
    this.popUpOpen = true;
  }

  cancelOption() {
    this.popUpOpen = false;
  }

}
