import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'pipeCheck'
})
export class PipeCheckPipe implements PipeTransform {
    transform(size: string) {
      let res="";
    
    switch(size.length){

    case 0: return res="No data";break;
    
    default:return size;
  
  }
  
}
}
