package com.trimindtech.training.day03;

public class BookRunner {
    public static void printNames(Book b)
    {
        System.out.println(b.author);
        System.out.println(b.cost);
        System.out.println(b.year);
    }
    public static void main(String[] args) {
     Book java=new Book("james",234.78,1978);

     printNames(java);
     Book python=new Book("pycharm",432.90,2012);

     printNames(python);
     Book cpp=new Book("gossling",278.98,1967);

     printNames(cpp);

    }
}
