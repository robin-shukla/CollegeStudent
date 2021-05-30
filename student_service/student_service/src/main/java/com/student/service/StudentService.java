package com.student.service;

import com.student.entity.Student;

import java.util.List;
import java.util.Optional;

public interface StudentService {
    public Optional<Student> getStudent(Integer id);
    public List<Student> getStudentByCollageName(String studentCollegeName);
    public List<Student> getAllStudent();

}
