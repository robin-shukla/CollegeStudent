import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http'
import { Observable } from 'rxjs';
import { College } from './college';

@Injectable({
  providedIn: 'root'
})
export class CollegeService {

  private baseUrl = "http://localhost:9001/college"; 

  constructor(private http: HttpClient) { }

  getCollege(): Observable<College[]>{
    return this.http.get<College[]>(`${this.baseUrl}`);
  }
}
