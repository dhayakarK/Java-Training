package com.trimindtech.training.day03;

public class PrintNames {
    public static void printNames(String[] arr)
    {
        for (String sp:arr) {
            System.out.println(sp);
        }
    }
    public static void main(String[] args) {
        String[] arr={"Trimind","Tech","solutions","Hyderabad"};
        printNames(arr);
    }
}
