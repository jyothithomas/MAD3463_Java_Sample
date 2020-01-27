package com.C0775696;

import java.time.LocalDate;
import java.util.Date;

public class StudentClassMain {
    public static void main(String[] args) {
        Student s1 = new Student();
       // LocalDate birthDate = LocalDate.of(1990, 8, 05);
        s1.setData(1,"Jyothi","Thomas",s1.birthDate,Gender.FEMALE,50);
        s1.printData();
        s1.getAge();
       // new Date()
        s1.hashMap();



    }
}
