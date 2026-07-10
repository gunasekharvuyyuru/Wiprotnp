package com.mile1.service;

import com.mile1.bean.Student;
import com.mile1.exception.NullMarksArrayException;
import com.mile1.exception.NullNameException;
import com.mile1.exception.NullStudentObjectException;

public class StudentReport {

    public String validate(Student s) throws NullNameException, NullMarksArrayException, NullStudentObjectException {

        if (s == null)
            throw new NullStudentObjectException();

        if (s.getName() == null)
            throw new NullNameException();

        if (s.getMarks() == null)
            throw new NullMarksArrayException();

        return "VALID";
    }

    public String findGrades(Student s) {

        int[] marks = s.getMarks();

        for (int m : marks) {
            if (m < 35) {
                s.setGrade("F");
                return "F";
            }
        }

        int sum = 0;

        for (int m : marks)
            sum += m;

        if (sum < 150) {
            s.setGrade("C");
            return "C";
        } else if (sum < 200) {
            s.setGrade("B");
            return "B";
        } else if (sum < 250) {
            s.setGrade("A");
            return "A";
        } else {
            s.setGrade("A+");
            return "A+";
        }
    }
}