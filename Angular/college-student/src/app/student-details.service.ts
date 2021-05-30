import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http'
import { Observable } from 'rxjs';
import { StudentDetails } from './student-details';

@Injectable({
  providedIn: 'root'
})
export class StudentDetailsService {

  private baseUrl = "http://localhost:9001/college/collagestudentdetails/"; 

  constructor(private http: HttpClient) { }

  getStudentDetail(collegename:any): Observable<StudentDetails[]>{
    return this.http.get<StudentDetails[]>(`${this.baseUrl}`+collegename);
  }
}
