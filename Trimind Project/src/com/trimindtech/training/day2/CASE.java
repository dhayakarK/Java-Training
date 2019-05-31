package com.trimindtech.training.day2;

import java.util.Scanner;

public class CASE {
    public static void main(String[] args) {
        int display;
        System.out.println("1.company pay for all\t 2.plan2=4.65\t 3.plan3=7.85\t 4.plan4=5.50");
        System.out.println("Enter which plan do u want::");
        Scanner kl=new Scanner(System.in);
        display=kl.nextInt();
        switch (display)
        {
            case 1:
                   System.out.println("company pays for all and cost is 0 rupees");
                   break;
            case 2:
                System.out.println("Plan 2 value=4.65");
                break;
            case 3:
                System.out.println("plan3 value=7.85");
                break;
            case 4:
                System.out.println("plan 4 value=5.50");
                break;
            default:
                System.out.println("please choose a proper plan");
        }
    }
}
