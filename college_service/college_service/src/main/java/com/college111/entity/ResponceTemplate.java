package com.college111.entity;


public class ResponceTemplate {

    private College college;
    private Student student;

    public ResponceTemplate(College college, Student student) {
        this.college = college;
        this.student = student;
    }

    public ResponceTemplate() {
    }

    public College getCollege() {
        return college;
    }

    public void setCollege(College college) {
        this.college = college;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
