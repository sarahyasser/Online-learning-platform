import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class CourseService {
  private courseManagementURL = 'http://localhost:8081';
  

  constructor() { }
}
