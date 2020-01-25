export class Media {
    file:string;
    title:string;
    catgeory:string;
    description:string;
    tags:string;
  
    constructor(file:string ,title:string,catgeory:string,description:string,tags:string) {
        this.file=file;
        this.title=title;
        this.catgeory=catgeory;
        this.description=description;
        this.tags=tags;
        
    }
}