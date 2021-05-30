import { Component, OnInit } from '@angular/core';
import { StudentDetails } from '../student-details';
import { StudentDetailsService } from '../student-details.service';
import { ActivatedRoute } from '@angular/router'

@Component({
  selector: 'app-student-details',
  templateUrl: './student-details.component.html',
  styleUrls: ['./student-details.component.css']
})
export class StudentDetailsComponent implements OnInit {

  public studentdetails!: StudentDetails[];
  studentname: any;
  constructor(private studentdetailsservice: StudentDetailsService, private route: ActivatedRoute) { 
  }

  ngOnInit(): void {
    let name = this.route.snapshot.paramMap.get('name');
    this.studentdetailsservice.getStudentDetail(name).subscribe((data: StudentDetails[]) => {
      console.log(data);
      this.studentdetails = data;
    });
    
  }
  Search(){
    if(this.studentname == ""){
      this.ngOnInit();
    }else{
      this.studentdetails = this.studentdetails.filter(res => {
       // return res.studentname.toLocaleLowerCase().match(this.studentname.toLocaleLowercase());
       return res.studentname.match(this.studentname);
      });
    }
  }
}
