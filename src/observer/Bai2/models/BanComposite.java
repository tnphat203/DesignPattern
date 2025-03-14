package src.observer.Bai2.models;

import src.observer.Bai2.observer.Composite;

import java.util.ArrayList;
import java.util.List;

/*
 * File: BanComposite
 * Author: Tran Ngoc Phat
 * Date: 3/14/2025
 */
public class BanComposite implements Composite {
    private String name;
    private double price;
    private List<Composite> listDoUong;

    public BanComposite(String name) {
        this.name = name;
        this.price = 0;
        this.listDoUong = new ArrayList<Composite>();
    }

    public void add(DoUongLeaf doUongLeaf) {
        listDoUong.add(doUongLeaf);
    }

    @Override
    public double totalPrice() {
        double totalPrice = 0;
        for (Composite composite : listDoUong) {
            totalPrice += composite.totalPrice();
        }
        this.price = totalPrice;
        return totalPrice;
    }
}
