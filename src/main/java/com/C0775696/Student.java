package com.C0775696;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.Date;

enum Gender {
    MALE,
    FEMALE,
    OTHER
}

public class Student {
    int studentId;
    String firstName, lastName;
    Date birthDate;
    Gender gender;
    float totalMarks;

    public void setData(int studentId, String firstName, String lastName, Date birthDate, Gender gender, float totalMarks) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.gender = gender;
        this.totalMarks = totalMarks;
    }

    public void printData() {
        System.out.println("Student id:" + studentId);
        System.out.println("Student First Name:" + firstName);
        System.out.println("Student Last Name:" + lastName);
        System.out.println("Student Birth Date :" + birthDate);
        System.out.println("Student Gender:" + gender);
        System.out.println("Student Total Marks:" + totalMarks);
    }

    public int getAge() {
        //this.birthDate = birthDate;
        LocalDate today = LocalDate.now();
        LocalDate birthDate = LocalDate.of(1990, Month.JANUARY, 24);
        Period p = Period.between(today, birthDate);
        System.out.println(p);
        return (Period.between(today, birthDate).getYears());

    }
}


