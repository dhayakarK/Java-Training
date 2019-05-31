package com.trimindtech.training.day03.day03homework;

public class Planet {
    public String name;
    public int travelDays;
    Planet(String name,int travelDays)
    {
        this.name=name;
        this.travelDays=travelDays;
    }
    public void printplanet()
    {
        System.out.println("name"+" "+name);
        System.out.println("traveldays"+" "+travelDays);
    }
    public void calculateAge(int age)
    {

        float ageontheplanet=(float) (age*365)/travelDays;
        System.out.println("Age on the"+" "+name+" "+ageontheplanet);
    }
}
class Test1
{
    public static void main(String[] args) {
        Planet p=new Planet("Venus",255);
        p.printplanet();
        p.calculateAge(28);
    }
}
