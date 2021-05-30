package com.student.service;

import com.student.dao.StudentRepository;
import com.student.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Optional<Student> getStudent(Integer id) {
        return studentRepository.findById(id);
    }

    @Override
    public List<Student> getStudentByCollageName(String studentCollegeName) {
        return studentRepository.findBystudentcollegename(studentCollegeName);
    }


    @Override
    public List<Student> getAllStudent() {
        return studentRepository.findAll();
    }

}
