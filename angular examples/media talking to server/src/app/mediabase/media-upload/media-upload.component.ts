import { Component, OnInit } from '@angular/core';
import { Route } from '@angular/compiler/src/core';
import { DataServiceService } from 'src/app/services/data-service.service';
import { Router } from '@angular/router';
import { Details } from 'src/app/model/details';
import { THIS_EXPR } from '@angular/compiler/src/output/output_ast';

@Component({
  selector: 'app-media-upload',
  templateUrl: './media-upload.component.html',
  styleUrls: ['./media-upload.component.css']
})
export class MediaUploadComponent implements OnInit {

  constructor(public details : DataServiceService,public router: Router ) { }

  ngOnInit() {
  }
  uploadMedia(title:HTMLInputElement, des:HTMLInputElement, tags:HTMLInputElement):void{
    let details = new Details(title.value,des.value,tags.value);
    this.details.addNewMedia(details).subscribe((response)=>console.log(response));
    title.value="";
    des.value="";
    tags.value="";
    this.router.navigate(['/details']);
  
  }
   
}
