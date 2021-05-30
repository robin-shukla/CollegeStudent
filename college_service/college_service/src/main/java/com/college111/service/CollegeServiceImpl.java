package com.college111.service;

import com.college111.dao.CollegeRepository;
import com.college111.entity.College;
import com.college111.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Optional;

@Service
public class CollegeServiceImpl implements CollegeService{

    @Autowired
    private  CollegeRepository collegeRepository;

    @Autowired
    private RestTemplate restTemplate;

    public List<College> getAllCollege(){
        return collegeRepository.findAll();
    }

    @Override
    public List<Student> getCollegeStudent() {
        List<Student> students = restTemplate.getForObject("http://localhost:9009/student",List.class);
        return students;
    }

    @Override
    public List<Student> getCollageStudentDetails(String studentCollegeName) {
        List<Student> students = restTemplate.getForObject("http://localhost:9009/student/studentdetails/" + studentCollegeName,List.class);
        return students;
    }


    @Override
    public Optional<College> getCollege(Integer id) {
        return collegeRepository.findById(id);
    }


}
