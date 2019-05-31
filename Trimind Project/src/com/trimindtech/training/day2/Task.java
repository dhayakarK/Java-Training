package com.trimindtech.training.day2;

import java.util.Scanner;

public class Task {
    public static void main(String[] sp)
    {
        int a=10,b=2;
        //System.out.println();
        char ch;
        char p;
        System.out.println("'+'.Addition\t '-'.subtraction\t '*'.multiplication\t '/'.divison\t '%'.modulo\t");
        System.out.println("Enter which operation do u want");
        Scanner s=new Scanner(System.in);
        p=s.next().charAt(0);
        switch (p)
        {
            case '+': System.out.println("adition="+(a+b));
                    break;
            case '-': System.out.println("Sub="+(a-b));
                    break;
            case '*': System.out.println("mul="+(a*b));
                      break;
            case '/': System.out.println("division="+(a/b));
                    break;
            case '%': System.out.println("modulo division="+(a%b));
                    break;
            default:System.out.println("cases doesnot macth");
        }
    }
}
