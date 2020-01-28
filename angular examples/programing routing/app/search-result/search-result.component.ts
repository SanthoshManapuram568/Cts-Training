import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-search-result',
  templateUrl: './search-result.component.html',
  styleUrls: ['./search-result.component.css']
})
export class SearchResultComponent implements OnInit {
searchData :string;
  constructor(public activated : ActivatedRoute) { 
    this.activated.params.subscribe((parameter)=>this.searchData=parameter["searchText"]);
  }

  ngOnInit() {
  }

}
