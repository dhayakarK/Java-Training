package com.trimindtech.training.day2;

import java.util.Scanner;

public class User {
    public static void main(String[] args) {
        int a,b;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
       /* b=sc.nextInt();
        String p=(a>b)?" the greater value"+a:" the lesser value is"+b;
        System.out.println(" the bigger value is "+" "+p);*/
       String s=(a%2==0)?"Even no":"odd no";
        System.out.println(s);
    }
}
