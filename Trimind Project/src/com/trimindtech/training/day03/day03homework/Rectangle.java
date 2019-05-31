package com.trimindtech.training.day03.day03homework;

public class Rectangle {
    private static double length;
    private static double width;

    public  void setLength(double length,double width) {
        Rectangle.length = length;
        Rectangle.width=width;
    }


    public double area()
    {
        double area=length*width;
        return area;
    }
    public double perimeter()
    {
        double perimeter=2*(length+width);
        return perimeter;
    }
}
class Rectangle1
{
    public static void main(String[] args) {
        Rectangle r=new Rectangle();
        r.setLength(3.45,7.78);
        System.out.println("Area of rectangle"+" "+r.area());
        System.out.println("Perimeter of rectangle"+" "+r.perimeter());
        Rectangle r1=new Rectangle();
        r.setLength(4,2);
        System.out.println("Area of rectangle"+" "+r1.area());
        System.out.println("Perimeter of rectangle"+" "+r1.perimeter());
    }
}
