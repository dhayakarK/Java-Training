package com.trimindtech.training.day04;



public class FruitRunner {

    public static void makeJuice(Fruit fruit){

        if (fruit instanceof Apple){
            ((Apple) fruit).removeSeeds();
        }else {
            fruit.peel();
        }
        fruit.makeJuice();
    }

    public static void main(String[] args) {

        Fruit orange=new Orange();
        Fruit apple=new Apple();

        makeJuice(orange);
        makeJuice(apple);



    }
}
