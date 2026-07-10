package com.mile1.main;

import com.mile1.bean.Student;
import com.mile1.service.StudentReport;
import com.mile1.service.StudentService;

public class StudentMain {

    static Student[] data = new Student[4];

    static {

        data[0] = new Student("Sekhar", new int[] {85, 75, 95}, null);
        data[1] = new Student(null, new int[] {11, 22, 33}, null);
        data[2] = null;
        data[3] = new Student("Manoj", null, null);
    }

    public static void main(String[] args) {

        StudentReport report = new StudentReport();

        for (Student s : data) {

            try {

                if (report.validate(s).equals("VALID")) {
                    System.out.println("Grade : " + report.findGrades(s));
                }

            } catch (Exception e) {
                System.out.println(e);
            }
        }

        StudentService service = new StudentService();

        System.out.println("Number of Null Marks Array : " + service.findNumberOfNullMarksArray(data));
        System.out.println("Number of Null Name : " + service.findNumberOfNullName(data));
        System.out.println("Number of Null Objects : " + service.findNumberOfNullObjects(data));
    }
}