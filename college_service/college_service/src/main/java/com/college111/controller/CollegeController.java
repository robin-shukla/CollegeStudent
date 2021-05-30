package com.college111.controller;

import com.college111.entity.College;
import com.college111.entity.ResponceTemplate;
import com.college111.entity.Student;
import com.college111.service.CollegeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/college")
public class CollegeController {

    @Autowired
    private CollegeService collegeService;

    @GetMapping
    public List<College> getAllCollege(){
        return this.collegeService.getAllCollege();
    }

    @GetMapping("/{collegeId}")
    public Optional<College> getCollege(@PathVariable("collegeId") Integer collegeId)
    {
        return this.collegeService.getCollege(collegeId);
    }

    @Autowired
    private RestTemplate restTemplate;

//    @GetMapping("/colstu/{collageName}")
//    public ResponceTemplate getCollegeStudent(@PathVariable("collageName") String collageName){
//        return collegeService.getCollegeStudent(collageName);
//    }

    @GetMapping("/collagestudent")
    public List<Student> getCollegeStudent(){
        return this.collegeService.getCollegeStudent();
    }

    @GetMapping("/collagestudentdetails/{studentCollageName}")
    public List<Student> getCollageStudentDetails(@PathVariable("studentCollageName") String studentCollageName)
    {
        return this.collegeService.getCollageStudentDetails(studentCollageName);
    }
}
