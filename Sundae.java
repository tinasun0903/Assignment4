package edu.ldsbc.service.assignment4;

public class Sundae extends IceCream {

    double costOfTopping;
    double price;
    public Sundae(String name, double cost, String caramel, double topping) {
        super(name, cost);
        this.costOfTopping=costOfTopping;
    }

    @Override
    public double calculateItemCost() {

        price=cost+costOfTopping;

        return price;
    }
    @Override
    public double findSalesTax(){return calculateItemCost()*0.1;}
}
