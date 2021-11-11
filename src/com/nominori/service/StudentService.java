package com.nominori.service;

import com.nominori.enums.StudentType;
import com.nominori.service.interfaces.IStudentService;
import com.nominori.student.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class StudentService implements IStudentService {

    @Override
    public List<Student> getRandomStudents() {
        Random random = new Random();
        List<Student> studentsList = new ArrayList<>();
        for(int id = 1; id<=100; id++){
            int studentProductivity = random.nextInt(2) + 1;
            int studentMotivation = random.nextInt(100) + 1;
            float studentGrade = (studentProductivity * studentMotivation) / 40f;
            studentsList.add
                    (new Student
                            (id,"Student" + random.nextInt(150),
                                    studentProductivity == 1 ? StudentType.NORMAL : StudentType.ADVANCED,
                                    studentMotivation,
                                    studentGrade));
        }

        return studentsList;
    }

}
