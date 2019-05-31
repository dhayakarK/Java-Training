package com.trimindtech.training.day04;

public class Houserunner {
    public static void main(String[] args) {
        House h=new House();
        House h1=new House("Apartment",3000.90,4);
        House h2=new House("Apartment",'B',4000.78,9,true);
        House[] harray={h,h1,h2};
        /* harray[3]={h,h1,h2};*/
//        System.out.println(h1.toString());
        for (House h5:harray) {
            System.out.println(h5);
        }
    }
}
