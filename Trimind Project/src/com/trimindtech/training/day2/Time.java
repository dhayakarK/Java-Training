package com.trimindtech.training.day2;

import java.util.Scanner;

public class Time {
    public static void main(String sp[])
    {
        int p,q;
        Scanner sc=new Scanner(System.in);
        p=sc.nextInt();
        q=p/60;
        int s=p%60;
        System.out.println("Time in "+" "+q+" "+" hours"+" and "+" "+s+" "+"minutes");
    }
}
