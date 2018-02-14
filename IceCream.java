package edu.ldsbc.service.assignment4;

public class IceCream extends Dessertitem {
    double cost;

    public IceCream(String name,double cost) {
        super(name);
        this.cost=cost;
    }


    @Override
    public double calculateItemCost() {

        return cost;
    }
    @Override
    public double findSalesTax(){return calculateItemCost()*0.1;}
}
