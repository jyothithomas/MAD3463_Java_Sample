package com.C0775696;

//import sun.jvm.hotspot.tools.SysPropsDumper;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.*;

import static java.lang.System.in;

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
    float subjectMark1;
    float subjectMark2;
    float subjectMark3;
    float subjectMark4;
    float subjectMark5;
    float totalMarks;
    float percentage;
    char result;


    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
    public float getSubjectMark1() {
        return subjectMark1;
    }

    public float getSubjectMark2() {
        return subjectMark2;
    }

    public float getSubjectMark3() {
        return subjectMark3;
    }

    public float getSubjectMark4() {
        return subjectMark4;
    }

    public float getSubjectMark5() {
        return subjectMark5;
    }

    public float getTotalMarks() {
        totalMarks = subjectMark1+subjectMark2+subjectMark3+subjectMark4+subjectMark5;
        return totalMarks;
    }
    public float getPercentage() {
        percentage = totalMarks/5;
        return percentage;
    }

    public char getResult() {
        if(percentage>90){
            result = 'A';
        }
        else if(percentage>80 && percentage<90){
            result = 'B';
        }
        else
            result = 'C';
        return result;
    }

    public void setData(int studentId, String firstName, String lastName, Date birthDate, Gender gender, float subjectMark1, float subjectMark2,
                        float subjectMark3, float subjectMark4, float subjectMark5, float totalMarks, float percentage, char result) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.gender = gender;
        this.subjectMark1=subjectMark1;
        this.subjectMark2=subjectMark2;
        this.subjectMark3=subjectMark3;
        this.subjectMark4=subjectMark4;
        this.subjectMark5=subjectMark5;
        this.percentage=percentage;
        this.result=result;
    }

    public void printData() {
        System.out.println("Student id:" + studentId);
        System.out.println("Student First Name:" + firstName);
        System.out.println("Student Last Name:" + lastName);
        System.out.println("Student Birth Date :" + getAge());
        System.out.println("Student Gender:" + gender);
        System.out.println("Student Marks");
        System.out.println("Student Total Marks:" + getTotalMarks());
        System.out.println("Student Percentage:"+getPercentage());
        System.out.println("Result"+getResult());
    }

    public int getAge() {
        //this.birthDate = birthDate;
        LocalDate today = LocalDate.now();
        LocalDate birthDate = LocalDate.of(1991, Month.FEBRUARY, 01);
        Period p = Period.between(today, birthDate);
        //System.out.println(p);
        return (Period.between(today, birthDate).getYears());

    }

}


