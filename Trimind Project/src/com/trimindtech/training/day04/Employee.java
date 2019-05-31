package com.trimindtech.training.day04;

public class Employee
{
    private String name;
    private   int age;
    private int experience;
    private double salary;
    Employee(String name,int age,int experience,double salary)
    {
        this.name=name;
        this.age=age;
        this.experience=experience;
        this.salary=salary;
        System.out.println("am in Employee class");
        System.out.println(getClass().getName());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", experience=" + experience +
                ", salary=" + salary +
                '}';
    }
}
