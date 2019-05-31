package com.trimindtech.training.day2;

import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        int a;
        Scanner pk=new Scanner(System.in);
        a=pk.nextInt();
        String s=(a>0)?"positive no":" negative no";
        System.out.println(s);
    }
}
