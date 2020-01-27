package com.C0775696;

//import sun.jvm.hotspot.tools.SysPropsDumper;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Set;

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
        System.out.println("Student Birth Date :" + getAge());
        System.out.println("Student Gender:" + gender);
        System.out.println("Student Total Marks:" + totalMarks);
    }

    public int getAge() {
        //this.birthDate = birthDate;
        LocalDate today = LocalDate.now();
        LocalDate birthDate = LocalDate.of(1990, Month.SEPTEMBER, 05);
        Period p = Period.between(today, birthDate);
        //System.out.println(p);
        return (Period.between(today, birthDate).getYears());

    }

    public void hashMap(){
        HashMap <String,String > hmp = new HashMap<>();
        hmp.put("hai","world");
        hmp.put("my","java");
        if(hmp.containsKey("hai")){
            System.out.println("contains::::"+hmp.get("hai"));
        }
        Set<String> set = hmp.keySet();
        System.out.println("initial keys::::"+set);

        Collection<String> collection = hmp.values();
        System.out.println("initial values::::"+collection);

        



    }
}


