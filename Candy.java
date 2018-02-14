package edu.ldsbc.service.assignment4;

public class Candy extends Dessertitem {
    private double weight;
    private double costPerLb;// those are the number variables
    public double price;// using double because we need to multiply

    public Candy(String name, double weight, double costPerLb) {
        super(name);
        this.weight = weight;
        this.costPerLb = costPerLb;// help initialize the class
    }

    @Override// inherit functions from the super class
    public double calculateItemCost() {
           price= Math.round(weight*costPerLb);


        return price;// return should be the last line of code

    }

    @Override
    public double findSalesTax(){return calculateItemCost()*0.1;}

}


