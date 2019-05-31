package com.trimindtech.training.day04.day04homework;

import java.util.Scanner;

public class Bakery {
    public String flavour;
    public String weight;
    public int quantity;
    public double price;
    Bakery()
    {
        this(""," ",0);
        this.flavour="Chocolate Moist";
        this.weight="1kg";
        this.quantity=1;

    }
    Bakery(String flavour,String weight,int quantity)
    {

        this.flavour=flavour;
        this.weight=weight;
        this.quantity=quantity;
    }


    public String getFlavour() {
        return flavour;
    }

    public void setFlavour(String flavour) {
        this.flavour = flavour;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Bakery{" +
                "flavour='" + flavour + '\'' +
                ", weight='" + weight + '\'' +
                ", quantity=" + quantity +'\''+",price="+price+'\'' +'}';
    }

    public void order()
    {
        int option;
        System.out.println("Enter options 1-5");
        Scanner sc=new Scanner(System.in);
        option= sc.nextInt();
        switch (option)
        {
            case 1: this.flavour="Chocolate Moist";
                    break;
            case 2:this.flavour="StrawBerry";
                    break;
            case 3:this.flavour="Blueberry";
                    break;
            case 4:this.flavour="Cheesy Cake";
                    break;
            case 5:this.flavour="American Chocolate";
                    break;
            default:
                System.out.println("Please choose proper option");
        }
        System.out.println("Enter the  Weight of the cake(1-1kg,2-2kg,3-3kg):");
        String  n=sc.next();
        this.weight=n;
        System.out.println("Enter quantity ordered:");
        int p=sc.nextInt();
        this.quantity=p;
        this.price=(double) p*25.50;
    }

    public double getPrice() {
        return this.getPrice();
    }
}
