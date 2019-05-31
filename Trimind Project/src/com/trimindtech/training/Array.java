package com.trimindtech.training;

public class Array {
    public static void main(String[] args) {
        int[] arr={1,5,7,8};
        int sum=0;
        for (int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
        }
        System.out.println("sum of array ele's is"+" "+sum);
    }
}
