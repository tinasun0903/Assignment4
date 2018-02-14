package edu.ldsbc.service.assignment4;

public class Cookie extends Dessertitem {
    double number;
    double pricePerDozen;
    double price;// make a variable for price so it can be used in the new method

    public Cookie(String name,double number, double pricePerDozen) {
        super(name);
        this.number=number;// call the function
        this.pricePerDozen=pricePerDozen;// call the function

    }

    @Override// must override the method from super class because the class is derived(inherit) from superclass
    public double calculateItemCost() {

        price=Math.round(number*pricePerDozen);
        return price;
    }
    @Override
    public double findSalesTax(){return calculateItemCost()*0.1;}
}
