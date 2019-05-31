package com.trimindtech.training.day2;

public class CheckElement {
    public static void main(String[] args) {
        int[] arr={12,14,17,4,8};
        int check=4;
        int i,j=0;
        for (i=0;i<arr.length;i++)
        {
            if (arr[i]==check)
            {
                j=i;
            }

        }
        System.out.println("Element present at the index :"+j);
    }
}
