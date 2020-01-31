import { Component, OnInit } from '@angular/core';
import { Details } from 'src/app/model/details';
import { ActivatedRoute, Router } from '@angular/router';
import { DataServiceService } from 'src/app/services/data-service.service';

@Component({
  selector: 'app-media-update',
  templateUrl: './media-update.component.html',
  styleUrls: ['./media-update.component.css']
})
export class MediaUpdateComponent implements OnInit {
  detailId : number;
  details : Details;
  constructor(public activatedRoute : ActivatedRoute,public router :Router,public detailService : DataServiceService ) { 
    this.activatedRoute.params.subscribe((parameter)=>this.detailId=parameter["detailId"]);
  }

  ngOnInit() {
   this.detailService.getOneMedia(this.detailId).subscribe((response:any)=>this.details=response);
  }
updateMedia(title:HTMLInputElement,des:HTMLInputElement,tag:HTMLInputElement):void{
 let detail=new Details(title.value,des.value,tag.value);
this.detailService.updateDetails(this.detailId,detail).subscribe((response)=>{
   this.router.navigate(['/media']);
   title.value = "";
    des.value = "";
    tag.value = "";
 })
}

}
