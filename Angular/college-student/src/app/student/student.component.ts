import { Component, OnInit } from '@angular/core';
import { Student } from '../student';
import { StudentService } from '../student.service';

@Component({
  selector: 'app-student',
  templateUrl: './student.component.html',
  styleUrls: ['./student.component.css']
})
export class StudentComponent implements OnInit {

  public students!: Student[];
  studentname: any;
  constructor(private studentService: StudentService) { 
  }

  ngOnInit(): void {
    this.studentService.getStudent().subscribe((data: Student[]) => {
      console.log(data);
      this.students = data;
    });
  }
  Search(){
    if(this.studentname == ""){
      this.ngOnInit();
    }else{
      this.students = this.students.filter(res => {
       // return res.studentname.toLocaleLowerCase().match(this.studentname.toLocaleLowercase());
       return res.studentname.match(this.studentname);
      });
    }
  }

}
