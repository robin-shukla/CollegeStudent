package com.student.controller;

import com.student.entity.Student;
import com.student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping
    public List<Student> getAllStudent(){
        return this.studentService.getAllStudent();
    }

    @GetMapping("/{studentId}")
    public Optional<Student> getStudentById(@PathVariable("studentId")Integer id){
        return this.studentService.getStudent(id);
    }

    @GetMapping("/studentdetails/{studentCollageName}")
    public List<Student> getStudentByCollageName(@PathVariable("studentCollageName")String studentCollegeName){
        return this.studentService.getStudentByCollageName(studentCollegeName);
    }

}
