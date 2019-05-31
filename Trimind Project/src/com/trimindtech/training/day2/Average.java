package com.trimindtech.training.day2;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        int n,k=0,m=0;
        double avg;

        int sum=0,i=0,j;
        int[] arr1=new int[3];
        int[] arr=new int[3];
        do {
            Scanner sc=new Scanner(System.in);
            n=sc.nextInt();
            sum+=n;
            arr1[i]=n;
            i=i+1;
        }while (n>0);
        for(j=0;j<i;j++)
        {
            arr[j]=arr1[j];
        }

        avg=(float) sum/i;
        System.out.println(i);
        System.out.println(""+avg);
        System.out.println(arr1[i]);
         for (j=0;j<i;j++)
         {
             if(avg>arr1[j])
                 k++;
             else
                 m++;
         }
        System.out.println("The above avg no ele's"+" "+k);
        System.out.println("the below avg no ele's"+m);
    }
}
