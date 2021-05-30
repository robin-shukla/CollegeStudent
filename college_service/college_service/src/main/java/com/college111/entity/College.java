package com.college111.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.ArrayList;
import java.util.List;

@Entity
public class College {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer collegeid;
    private String collegename;
    private String collegeaddress;
    private String collegepincode;
    private String collegephoneno;
    private String collegeemail;
  //  List<Student> students= new ArrayList<>();

    public College(Integer collegeid, String collegename, String collegeaddress, String collegepincode, String collegephoneno, String collegeemail) {
        this.collegeid = collegeid;
        this.collegename = collegename;
        this.collegeaddress = collegeaddress;
        this.collegepincode = collegepincode;
        this.collegephoneno = collegephoneno;
        this.collegeemail = collegeemail;
    }


    public College() {
    }

    public Integer getCollegeid() {
        return collegeid;
    }

    public void setCollegeid(Integer collegeid) {
        this.collegeid = collegeid;
    }

    public String getCollegename() {
        return collegename;
    }

    public void setCollegename(String collegename) {
        this.collegename = collegename;
    }

    public String getCollegeaddress() {
        return collegeaddress;
    }

    public void setCollegeaddress(String collegeaddress) {
        this.collegeaddress = collegeaddress;
    }

    public String getCollegepincode() {
        return collegepincode;
    }

    public void setCollegepincode(String collegepincode) {
        this.collegepincode = collegepincode;
    }

    public String getCollegephoneno() {
        return collegephoneno;
    }

    public void setCollegephoneno(String collegephoneno) {
        this.collegephoneno = collegephoneno;
    }

    public String getCollegeemail() {
        return collegeemail;
    }

    public void setCollegeemail(String collegeemail) {
        this.collegeemail = collegeemail;
    }
}
