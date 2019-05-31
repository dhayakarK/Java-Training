package com.trimindtech.training.day2;

import java.util.Scanner;

public class Raduis1 {
    public static void main(String[] args) {
        int r, i = 1;
        double raduis;
        double PI = 22.0 / 7;
        do {
            System.out.println("Enter a positive raduis");
            Scanner sc=new Scanner(System.in);
            r=sc.nextInt();
        }while (r<0);
        System.out.println("raduis="+(PI*r*r));
    }
}