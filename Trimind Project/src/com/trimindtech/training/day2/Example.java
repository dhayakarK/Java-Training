package com.trimindtech.training.day2;

import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        double Pay=1;
        int HourlyRate;
        int Hours;
        //double overTimePay;
        Scanner sc=new Scanner(System.in);
        Hours=sc.nextInt();
        HourlyRate=sc.nextInt();
        if(Hours>40)
        {
           Pay=1.5*HourlyRate;
            System.out.println("pay"+Pay);
        }
        else {
            Pay=HourlyRate;
            System.out.println("pay "+" "+Pay);
        }
    }
}
