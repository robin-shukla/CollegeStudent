package com.student.dao;

import com.student.entity.Student;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.scheduling.annotation.Async;

import java.util.List;
import java.util.Optional;

public interface StudentRepository extends JpaRepository<Student, Integer> {
    
    List<Student> findBystudentcollegename(final String studentCollegeName);
}
