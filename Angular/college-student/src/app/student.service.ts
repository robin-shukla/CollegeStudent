import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http'
import { Observable } from 'rxjs';
import { Student } from './student';

@Injectable({
  providedIn: 'root'
})
export class StudentService {

  private baseUrl = "http://localhost:9009/student"; 

  constructor(private http: HttpClient) { }

  getStudent(): Observable<Student[]>{
    return this.http.get<Student[]>(`${this.baseUrl}`);
  }
}
