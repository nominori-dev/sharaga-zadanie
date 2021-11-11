package com.nominori.student;

import com.nominori.enums.StudentType;

public class Student {

    private Integer studentId;
    private String studentName;
    private StudentType studentType;
    private Integer motivation;
    private Float grade;

    public Student(Integer studentId, String studentName, StudentType studentType, Integer motivation, Float grade) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentType = studentType;
        this.motivation = motivation;
        this.grade = grade;
    }

    public StudentType getStudentType() {
        return studentType;
    }

    public void setStudentType(StudentType studentType) {
        this.studentType = studentType;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Integer getMotivation() {
        return motivation;
    }

    public void setMotivation(Integer motivation) {
        this.motivation = motivation;
    }

    public Float getGrade() {
        return grade;
    }

    public void setGrade(Float grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return new StringBuilder(150)
                .append(studentName + " ")
                .append(studentType.getValue() + " ")
                .append(motivation + " ")
                .append(grade + " ")
                .toString();
    }
}
