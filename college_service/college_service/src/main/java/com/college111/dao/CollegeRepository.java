package com.college111.dao;

import com.college111.entity.College;
import org.springframework.data.jpa.repository.JpaRepository;

public interface  CollegeRepository extends JpaRepository<College, Integer> {

}
