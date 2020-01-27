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
        HashMap <Integer,String > hmp = new HashMap<Integer, String>();
        hmp.put(1,"world");
        hmp.put(2,"java");
        if(hmp.containsKey("hai")){
            System.out.println("contains::::"+hmp.get("hai"));
        }
        Set<Integer> set = hmp.keySet();
        System.out.println("initial keys::::"+set);

        Collection<String> collection = hmp.values();
        System.out.println("initial values::::"+collection);


        hmp.put(3,"more");
        System.out.println("new  keys::::"+set);
        System.out.println("new values::::"+collection);
        System.out.println(hmp.containsValue("more"));

    }

    public void functionExamples(){
        Scanner input = new Scanner(in);
        //SUM OF INTEGERS IN A NUMBER
        int sum =0;
        System.out.println("enter number 1");
        Long firstNum = input.nextLong();
        while(firstNum!=0){

            sum+=firstNum%10;
            firstNum/=10;
        }
        System.out.println(sum);
    }
    public void stringHandling(){
        int alphacount = 0, spacecount =0, numcount =0;
        Scanner in = new Scanner(System.in);
        System.out.println("enter the string");
        String s = in.nextLine();
        char ch[] = s.toCharArray();
        for(int i=0;i<ch.length;i++){
            if(Character.isAlphabetic(ch[i])){
                alphacount++;
            }
            if(Character.isDigit(ch[i])){
                numcount++;
            }
            if(Character.isSpaceChar(ch[i])){
                spacecount++;

            }

        }
        System.out.println(alphacount);
        System.out.println(numcount);
        System.out.println(spacecount);

    }
}


