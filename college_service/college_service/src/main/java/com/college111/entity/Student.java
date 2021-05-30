package com.college111.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer studentid;
    private String studentname;
    private String studentcollegename;
    private String studentrollno;
    private String studentphoneno;
    private String studentemailid;
    private String studentaddress;

    public Student(Integer studentid, String studentname, String studentcollegename, String studentroolno, String studentphoneno, String studentemailid, String studentaddress) {
        this.studentid = studentid;
        this.studentname = studentname;
        this.studentcollegename = studentcollegename;
        this.studentrollno = studentroolno;
        this.studentphoneno = studentphoneno;
        this.studentemailid = studentemailid;
        this.studentaddress = studentaddress;
    }

    public Student() {
    }

    public Integer getStudentid() {
        return studentid;
    }

    public void setStudentid(Integer studentid) {
        this.studentid = studentid;
    }

    public String getStudentname() {
        return studentname;
    }

    public void setStudentname(String studentname) {
        this.studentname = studentname;
    }

    public String getStudentcollegename() {
        return studentcollegename;
    }

    public void setStudentcollegename(String studentcollegename) {
        this.studentcollegename = studentcollegename;
    }

    public String getStudentroolno() {
        return studentrollno;
    }

    public void setStudentroolno(String studentroolno) {
        this.studentrollno = studentroolno;
    }

    public String getStudentphoneno() {
        return studentphoneno;
    }

    public void setStudentphoneno(String studentphoneno) {
        this.studentphoneno = studentphoneno;
    }

    public String getStudentemailid() {
        return studentemailid;
    }

    public void setStudentemailid(String studentemailid) {
        this.studentemailid = studentemailid;
    }

    public String getStudentaddress() {
        return studentaddress;
    }

    public void setStudentaddress(String studentaddress) {
        this.studentaddress = studentaddress;
    }
}
