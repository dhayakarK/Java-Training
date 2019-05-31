package com.trimindtech.training.day2;

import java.util.Scanner;

public class HelloTrimind {
    public static void main(String[] args) {
        int n;
        Scanner po=new Scanner(System.in);
        n=po.nextInt();
        if ((n%2==0)&&(n%3==0))
        {
            System.out.println("Hello World");
        }
        else if(n%2==0)
        {
            System.out.println("Hello");
        }
        else if (n%3==0)
        {
            System.out.println("World");
        }

    }
}
