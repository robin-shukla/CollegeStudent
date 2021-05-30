package com.college111.service;

import com.college111.entity.College;
import com.college111.entity.Student;

import java.util.List;
import java.util.Optional;

public interface CollegeService {
    public Optional<College> getCollege(Integer id);
    public List<College> getAllCollege();
    public List<Student> getCollegeStudent();
    public List<Student> getCollageStudentDetails(String studentCollatgeName);
    
}
