package com.trimindtech.training.day2;
class Arraye
{
    public int id;
    public String name;
    Arraye(int id,String name)
    {
        this.id=id;
        this.name=name;
    }
}
public class Array2 {
    public static void main(String[] args) {
     Arraye[] arr;
     arr =new Arraye[3];
     arr[0]=new Arraye(1,"Dhaya");
     arr[1]=new Arraye(2,"Venky");
     arr[2]=new Arraye(3,"Aravindh");
     for(int i=0;i<arr.length;i++)
     {
         System.out.println("Element at "+i+" :"+arr[i].id+" "+arr[i].name);
     }
    }
}
