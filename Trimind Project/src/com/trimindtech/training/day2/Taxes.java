package com.trimindtech.training.day2;

import java.util.Scanner;

public class Taxes {
    public static double single(double amount)
    {
        if (amount<=6000)
        {
             amount=10.0/100*amount;
        }
        else if((amount>=6001)&&(amount<=27950))
        {
            amount=15.0/100*amount;
        }
        else if ((amount>=27951)&&(amount<=67700))
        {
            amount=27.0/100*amount;
        }
        return amount;
    }
    public static double singlejoint(double amount)
    {
        if(amount<=12000)
        {
            amount=10.0/100*amount;
        }
        else if ((amount>12001)&&(amount<46700))
        {
            amount=15.0/100*amount;
        }
        else if ((amount>46701)&&(amount<112850))
        {
            amount=27.0/100*amount;
        }

        return amount;
    }
    public static double married(double amount)
    {

        if ((amount<=6000))
        {
            amount=10.0/100*amount;
        }
        else if((amount>6001)&&(amount<23350))
        {
            amount=15.0/100*amount;
        }

        return amount;
    }
    public static double Household(double amount)
    {
        if ((amount<=10000))
        {
            amount=10.0/100*amount;
        }
        else if ((amount>10001)&&(amount<37450))
        {
            amount=15.0/100*amount;
        }
        else if ((amount>37451)&&(amount<96700))
        {
            amount=27.0/100*amount;
        }
        return amount;
    }


    public static void main(String[] args) {
        int salary,status;
        double amount;
        System.out.println("Enter your salary");
        Scanner sc=new Scanner(System.in);
        salary=sc.nextInt();
        System.out.println("1.single Filers\t 2.married filling jointly\t 3.married filling separatly\t 4.head of household");
        System.out.println("Enter your status");
        status=sc.nextInt();
        switch (status)
        {
            case 1:
                System.out.println(single(salary));
                break;
            case 2:
                System.out.println(singlejoint(salary));
                break;
            case 3:
                System.out.println(married(salary));
                break;
            case 4:
                System.out.println(Household(salary));
                break;
            default:
                   System.out.println("wrong option");
         }
    }
}
