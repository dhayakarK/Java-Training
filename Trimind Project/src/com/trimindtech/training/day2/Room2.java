package com.trimindtech.training.day2;


import java.util.Scanner;

public class Room2 {
    public static void main(String[] args) {
        int area;
        int le,wi;
        System.out.println("Enter length:");
        Scanner len=new Scanner(System.in);
        le=len.nextInt();
        System.out.println("Enter width");
        Scanner wid=new Scanner(System.in);
        wi=wid.nextInt();
        area=le*wi;
        System.out.println("The floor space of the room is "+area+" "+"Square feets");
    }
}
