package com.trimindtech.training.day2;

import java.util.Arrays;

public class TwoD_Array {
    public static void main(String[] args) {
        int[][] arr={{1,2,3,4},{5,6,7,8}};
        int i,j;
        for(i=0;i<arr.length;i++)
        {
            //System.out.println(Arrays.toString(arr[i]));
            for (j=0;(arr[i]!=null&&j<arr[i].length);j++)
            {
                System.out.print(arr[i][j]+" ");

            }
            System.out.println(

            );
        }
    }
}
