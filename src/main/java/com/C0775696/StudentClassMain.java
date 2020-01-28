package com.C0775696;

import java.time.LocalDate;
import java.util.Date;

public class StudentClassMain {
    public static void main(String[] args) {
        Student s1 = new Student();
       // LocalDate birthDate = LocalDate.of(1990, 8, 05);
        s1.setData(1,"Kamal","Preet",s1.birthDate,Gender.FEMALE,
                100,80,79,99,100,s1.getTotalMarks(),s1.getPercentage(),s1.getResult());
        s1.printData();
        s1.getAge();




    }
}
