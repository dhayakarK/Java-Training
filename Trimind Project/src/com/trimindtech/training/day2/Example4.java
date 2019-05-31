package com.trimindtech.training.day2;

public class Example4 {
    public static void main(String[] args) {
        double i,sum=0;
        for (i=0.01;i<=1.0;i=i+0.01)
        {
            sum+=i;
        }
        System.out.println(sum);
    }
}
