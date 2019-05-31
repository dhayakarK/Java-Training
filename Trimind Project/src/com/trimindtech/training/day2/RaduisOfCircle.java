package com.trimindtech.training.day2;

import java.util.Scanner;

public class RaduisOfCircle {
    public static void main(String[] args) {
        double raduis;
        int r;
        double PI=22.0/7;
        System.out.println("Enter the raduis of a cirle");
        Scanner sc=new Scanner(System.in);
        r=sc.nextInt();
        if(r<0)
        {
            System.out.println("Enter positive value");
        }
        else
        {
            raduis=PI*r*r;
            System.out.println("Raduis of the circle is "+raduis);
        }
    }
}
