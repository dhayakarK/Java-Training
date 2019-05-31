package com.trimindtech.training.day04;

public class Manager extends Employee {
    public int bonus;

    Manager(String name, int age, int experience, double salary) {
        super(name, age, experience, salary);
    }


    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    @Override
    public double getSalary() {
        return super.getSalary()+bonus;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "bonus=" + bonus +
                '}'+"\n"+"name"+" "+getName();
    }

    public static void main(String[] args) {
        Manager m=new Manager("trimind",21,24,24000);
        m.setSalary(40000);
        m.setBonus(6000);
        m.setName("Jon Doe");
        System.out.println(m.getName());
        /*m.setAge(40);
        System.out.println(m.getAge());
        m.setExperience(10);
        System.out.println(m.getExperience());*/
        System.out.println(m.getSalary());
        System.out.println(m.toString());
        /*System.out.println(m.getClass().getName());*/

    }
}
