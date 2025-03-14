package src.observer.Bai2.main;

import src.observer.Bai2.models.BanComposite;
import src.observer.Bai2.models.DoUongLeaf;
import src.observer.Bai2.models.QuanCaPheComposite;

/*
 * File: Main
 * Author: Tran Ngoc Phat
 * Date: 3/14/2025
 */
public class Main {
    public static void main(String[] args) {
        DoUongLeaf doUongLeaf = new DoUongLeaf("Cà phê sữa", 35000);
        DoUongLeaf doUongLeaf1 = new DoUongLeaf("Cà phê đen", 33000);
        DoUongLeaf doUongLeaf2 = new DoUongLeaf("Cà phê sữa đá", 35000);
        DoUongLeaf doUongLeaf3 = new DoUongLeaf("Cà phê đen đá", 30000);
        DoUongLeaf doUongLeaf4 = new DoUongLeaf("Trà sữa Lài", 25000);
        DoUongLeaf doUongLeaf5 = new DoUongLeaf("Trà sữa Olong", 30000);
        DoUongLeaf doUongLeaf6 = new DoUongLeaf("Trà sữa Thái", 35000);

        BanComposite banComposite = new BanComposite("Bàn 1");
        banComposite.add(doUongLeaf);
        banComposite.add(doUongLeaf1);
        banComposite.add(doUongLeaf2);
        System.out.println("Tong tien ban 1: " + banComposite.totalPrice());

        BanComposite banComposite1 = new BanComposite("Bàn 2");
        banComposite1.add(doUongLeaf3);
        banComposite1.add(doUongLeaf4);
        banComposite1.add(doUongLeaf5);
        banComposite1.add(doUongLeaf6);
        System.out.println("Tong tien ban 2: " + banComposite1.totalPrice());

        QuanCaPheComposite quanCaPheComposite = new QuanCaPheComposite("Quán cà phê");
        quanCaPheComposite.add(banComposite);
        quanCaPheComposite.add(banComposite1);
        System.out.println("Tong tien quan: " + quanCaPheComposite.totalPrice());
    }
}
