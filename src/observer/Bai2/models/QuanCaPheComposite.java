package src.observer.Bai2.models;

import src.observer.Bai2.observer.Composite;

import java.util.ArrayList;
import java.util.List;

/*
 * File: QuanCaPheComposite
 * Author: Tran Ngoc Phat
 * Date: 3/14/2025
 */
public class QuanCaPheComposite implements Composite {
    private String name;
    private double price;
    private List<Composite> listBan;

    public QuanCaPheComposite(String name) {
        this.name = name;
        this.price = 0;
        this.listBan = new ArrayList<Composite>();
    }

    public void add(BanComposite banComposite) {
        listBan.add(banComposite);
    }

    @Override
    public double totalPrice() {
        double totalPrice = 0;
        for (Composite composite : listBan) {
            totalPrice += composite.totalPrice();
        }
        this.price = totalPrice;
        return totalPrice;
    }
}
