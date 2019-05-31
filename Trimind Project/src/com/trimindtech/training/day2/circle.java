package com.trimindtech.training.day2;

import java.util.Scanner;

public class circle {
    public static void main(String args[])
    {
        float raduis;
        double area;
        double PI=22.0/7;
        /*

        * code to read the data from console*/
        System.out.println("Enter readuis");
        Scanner scan= new Scanner(System.in);
        raduis=scan.nextFloat();
        area=PI*raduis*raduis;
        System.out.println(area);
    }
}
