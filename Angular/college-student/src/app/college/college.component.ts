import { Component, OnInit } from '@angular/core';
import { College } from '../college';
import { CollegeService } from '../college.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-college',
  templateUrl: './college.component.html',
  styleUrls: ['./college.component.css']
})
export class CollegeComponent implements OnInit {

  public colleges!: College[];
  collegename: any;
  constructor(private collegeservice: CollegeService, private router: Router) { 
  }

  ngOnInit(): void {
    this.collegeservice.getCollege().subscribe((data: College[]) => {
      console.log(data);
      this.colleges = data;
    });
  }

  onSelect(college:any){
    this.router.navigate(['/studentdetails',college.collegename]);
  }

  Search(){
    if(this.collegename == ""){
      this.ngOnInit();
    }else{
      this.colleges = this.colleges.filter(res => {
       // return res.studentname.toLocaleLowerCase().match(this.studentname.toLocaleLowercase());
       return res.collegename.match(this.collegename);
      });
    }
  }

}
