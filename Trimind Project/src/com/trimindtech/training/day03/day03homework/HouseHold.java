package com.trimindtech.training.day03.day03homework;

public class HouseHold {
    private int noOfOccupants;
    private  double annualIncome;
    HouseHold()
    {
        noOfOccupants=1;
        annualIncome=0;
        CalculateAverage();
    }
    HouseHold(int occupant)
    {
        this.noOfOccupants=occupant;
    }
    HouseHold(int occupant,double Income)
    {
        this.noOfOccupants=occupant;
        this.annualIncome=Income;
        CalculateAverage();
    }
    public  void CalculateAverage()
    {
        double AvgIncome=annualIncome/noOfOccupants;
        System.out.println("Avg Income"+" "+AvgIncome);
    }
}
class Test
{
    public static void main(String[] args) {
        HouseHold h=new HouseHold();
        HouseHold h1=new HouseHold(5);
        HouseHold h2=new HouseHold(6,25000.78);

    }
}
