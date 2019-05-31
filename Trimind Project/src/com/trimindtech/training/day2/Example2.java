package com.trimindtech.training.day2;

import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        int n,sum=0;

        do {
            Scanner s=new Scanner(System.in);
            n=s.nextInt();
            sum=sum+n;
            System.out.println(sum);
        }while (n>0);
        if(n==0)
        {
            System.out.println();
        }
    }
}
