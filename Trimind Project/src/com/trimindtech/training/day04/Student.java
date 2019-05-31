package com.trimindtech.training.day04;

public class Student {
    public  String name;
    public  int age;
    public static int var;
    public Student()
    {
        System.out.println("student object1 "+" "+var);
    }
    Student(int age)
    {
        this.name=name;
        var=var+1;
        System.out.println("student object2"+" "+var);
    }
    Student(String name,int age)
    {
        this.name=name;
        this.age=age;
        var=var+1;
        System.out.println("student obejct3"+" "+var);
    }

    public static void main(String[] args) {
        Student s=new Student();
        Student s1=new Student(21);
        Student s2=new Student("trimind",25);
    }
}
