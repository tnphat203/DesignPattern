package src.observer.Bai2.models;

import src.observer.Bai2.observer.Composite;

/*
 * File: DoUongLeaf
 * Author: Tran Ngoc Phat
 * Date: 3/14/2025
 */
public class DoUongLeaf implements Composite {
    private String name;
    private double price;

    public DoUongLeaf(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public double totalPrice() {
        return this.price;
    }
}
