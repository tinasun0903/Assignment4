package edu.ldsbc.service.assignment4;

import java.util.ArrayList;

public class Checkout {

    ArrayList<Dessertitem> dessertItemsList= new ArrayList<Dessertitem>();


    public void add(Dessertitem obj) { this.dessertItemsList.add(obj);

    }

    public double totalCost(){
        double totalCost = 0;
        for (Dessertitem item: dessertItemsList) {
            totalCost = totalCost + item.calculateItemCost();

        }

        return totalCost;

    }

    public double totalTax (){
        double totalCost = 0;
        for (Dessertitem item: dessertItemsList) {
            totalCost = totalCost + item.findSalesTax();

        }

        return totalCost;

    }

public void printReceipt() {
    for (Dessertitem item : dessertItemsList) {

    }
    System.out.println(dessertItemsList);
}}


