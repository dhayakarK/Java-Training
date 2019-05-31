package com.trimindtech.training.day04;

public class House
{
    public String type;
    public char zone;
    public double price;
    public int noOfBedRooms;
    public boolean freehold;
    public House()
    {
        this.type="Apartment";
        this.zone='A';
        this.price=68000.00;
        this.noOfBedRooms=3;
        this.freehold=false;
    }
    public House(String type,double price,int noOfBedRooms)
    {
        this.type=type;
        this.price=price;
        this.noOfBedRooms=noOfBedRooms;
    }
    public House(String type,char zone,double price,int noOfBedRooms,boolean freehold)
    {
        this.type=type;
        this.zone=zone;
        this.price=price;
        this.noOfBedRooms=noOfBedRooms;
        this.freehold=freehold;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public char getZone() {
        return zone;
    }

    public void setZone(char zone) {
        this.zone = zone;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getNoOfBedRooms() {
        return noOfBedRooms;
    }

    public void setNoOfBedRooms(int noOfBedRooms) {
        this.noOfBedRooms = noOfBedRooms;
    }

    public boolean isFreehold() {
        return freehold;
    }

    public void setFreehold(boolean freehold) {
        this.freehold = freehold;
    }

    @Override
    public String toString() {
        return "House{" +
                "type='" + type + '\'' +
                ", zone=" + zone +
                ", price=" + price +
                ", noOfBedRooms=" + noOfBedRooms +
                ", freehold=" + freehold +
                '}';
    }
}
