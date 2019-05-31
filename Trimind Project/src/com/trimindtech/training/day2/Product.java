package com.trimindtech.training.day2;

import java.util.Scanner;

public class Product {
    public static void main(String[] args) {
        int product;
        double sell;
        System.out.println("1.product=2.98\t 2.product=4.50\t 3.product=9.98 4.product=4.49\t 5.product=6.87");
        Scanner sc=new Scanner(System.in);
        product=sc.nextInt();
        sell=sc.nextDouble();
        System.out.println("product="+product);
        System.out.println("Quantity sold"+" "+sell);
    }
}
