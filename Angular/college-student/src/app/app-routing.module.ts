import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CollegeComponent } from './college/college.component';
import { HomeComponent } from './home/home.component';
import { StudentDetailsComponent } from './student-details/student-details.component';
import { StudentComponent } from './student/student.component';

const routes: Routes = [
  { path: '', redirectTo: 'home', pathMatch: 'full'},
  { path: 'student', component: StudentComponent},
  { path: 'college', component: CollegeComponent},
  { path: 'home', component:HomeComponent},
  { path: 'home/student', component: StudentComponent},
  { path: 'home/college', component: CollegeComponent},
  { path: 'studentdetails/:name', component: StudentDetailsComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
