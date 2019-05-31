package com.trimindtech.training.day2;

public class LargestElement {
    public static void main(String[] args) {
        int[] arr={19,8,7,20,32};
        int i,large;
        large=arr[0];
        System.out.println("Array ele's are:");
        for(i=0;i<arr.length;i++)
        {
            System.out.print("\t"+arr[i]);
        }
        System.out.println();
        for (i=0;i<arr.length;i++)
        {
              if(arr[i]>large)
              {
                  large=arr[i];
              }
        }
        System.out.println("Largest ele in an array is "+large);
    }
}
