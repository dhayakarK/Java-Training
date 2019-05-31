package com.trimindtech.training.day2;

import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {
        int n,sum=0,i=0;
        Scanner gh=new Scanner(System.in);
        n=gh.nextInt();
        while (i<=n)
        {
            sum+=i;
            i++;
        }
        System.out.println("sum of "+" "+n+" "+" is"+" "+sum);
    }
}
