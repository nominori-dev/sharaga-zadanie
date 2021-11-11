package com.nominori;

import com.nominori.service.StudentService;
import com.nominori.service.interfaces.IStudentService;
import com.nominori.student.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    private StudentService studentService = new StudentService();
    private List<Student> students = new ArrayList<>();


    public static void main(String[] args) {
        Main main = new Main();
        main.start();
    }

    public void start(){
        students = studentService.getRandomStudents();
        System.out.println("All students:");
        System.out.println(students);
        System.out.println("Students with grades below 2.6:");
        System.out.println(students.stream().filter(student -> student.getGrade() < 2.6).collect(Collectors.toList()));
    }

}
