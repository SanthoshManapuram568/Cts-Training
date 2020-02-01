import { Component, OnInit } from '@angular/core';
import{FormGroup, FormControl, FormBuilder, Validators} from'@angular/forms';
@Component({
  selector: 'app-single-media',
  templateUrl: './single-media.component.html',
  styleUrls: ['./single-media.component.css']
})
export class SingleMediaComponent implements OnInit {
  title1:string;
  descpri1 : string;
  tag1: string;
  myFormGroup:FormGroup;
  constructor(formBuilder: FormBuilder) {
    console.log("in form bilder of single media");
    this.myFormGroup=formBuilder.group({
      "title1":new FormControl(""),
      "descp1":new FormControl(""),
      "tags1":new FormControl("")
    });

  }
  mediaDetails(){
    console.log("Single Media Details method");
    this.title1= this.myFormGroup.controls['title1'].value;
    this.descpri1=this.myFormGroup.controls['descp1'].value;
    this.tag1=this.myFormGroup.controls['tags1'].value;
    console.log("Title : "+this.title1+"\n"+"Description : "+this.descpri1+"\n"+"Tags : "+this.tag1);
  }
message(){
  alert("you have uploaded the media & redirecting you to gallery")
}
  ngOnInit() {
  }

}
