package edu.ldsbc.service.assignment4;

 public abstract class Dessertitem {
      public String name;

      //This is the name of the dessert item

    public Dessertitem(String name) {
        this.name = name;
    }// This is the constructor method

    public double calculateItemCost(){
          return 0;
      }// this is a calculate item cost method.

    public double findSalesTax(){return 0;}

 }

