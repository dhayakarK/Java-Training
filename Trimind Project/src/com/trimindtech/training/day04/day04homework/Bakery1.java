package com.trimindtech.training.day04.day04homework;

import java.util.Scanner;

public class Bakery1 {
    public static void main(String[] args) {
        Bakery b=new Bakery();
        String df;
        System.out.println("Flavour List");
        System.out.println("1.Chocolate Moist\t 2.StrawBerry\t 3.BlueBerry\t 4.Cheesy Cake\t 5.American Choclate");
        System.out.println("Price List");
        System.out.println("1.(1)kg=INR 25.50\t 2.(2)kg=INR 50.00\t 3.(3)kg=INR 70.00");
        System.out.println("Enter list of items:");
        //System.out.println("Enter how many typesof cake would you like to order");
        int s;
        System.out.println("Enter how many Bakery items do you want:");
        Scanner sc=new Scanner(System.in);
        s=sc.nextInt();
        for (int i=0;i<s;i++) {
            b.order();
            //System.out.println(b.getPrice(25));
            System.out.println(b.toString());
        }
    }


}
