import { Component, OnInit } from '@angular/core';
import { Details } from 'src/app/model/details';
import { DataServiceService } from 'src/app/services/data-service.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-media-display',
  templateUrl: './media-display.component.html',
  styleUrls: ['./media-display.component.css']
})
export class MediaDisplayComponent implements OnInit {
  details :Array<Details>
  constructor(public detail :DataServiceService,public router : Router) { }
add(){
  console.log("added");
  this.router.navigate(['/details1']);
}
update(id:number){
  this.router.navigate(['/details-update/'+id]);
}

delete(id:number){ 
  this.detail.deleteDetails(id).subscribe((response) => {
      console.log(response);
      this.detail.getMedia().subscribe((response:any) => this.details = response);
  });
}
  ngOnInit() {
 this.detail.getMedia().subscribe((response:any)=>this.details=response);
  }

}
