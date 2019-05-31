package com.trimindtech.training.day2;

import java.util.Scanner;

public class Raduis2 {
    public static void main(String[] args) {
        int i;
        Scanner mk=new Scanner(System.in);
        i=mk.nextInt();
        if((i>0)&&(i<=100))
        {
            System.out.println("value is between 100");
        }
        else {
            System.out.println("no not between 1 and " +
                    "100");
        }
    }
}
