package com.company;

import java.util.Scanner;

public class ShipCostCalculator {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the price of an item=");
        while(!in.hasNextFloat())
        {
            in.next();
            System.out.println("enter valid price=");
        }
        float price = in.nextFloat();
        float shipping = (2 * price)/100;
        float total=0;
        System.out.println("Shipping cost=" + shipping);
        if(price<=100)
        {
            total = price+ shipping;
            System.out.println("Total price of an item including shipping cost= " + total);
        }
        else
        {
            total = price;
            System.out.println("Total price of an item exclude shipping cost= " + total);
        }
        in.close();
    }
}
