package src.observer.Bai1.services;

import src.observer.Bai1.observers.Observer;

import java.util.ArrayList;
import java.util.List;

/*
 * File: LopTruong
 * Author: Tran Ngoc Phat
 * Date: 3/11/2025
 */
public class LopTruong {
    private List<Observer> observers = new ArrayList<>();

    public void add(Observer observer) {
        observers.add(observer);
    }

    public void remove(Observer observer) {
        observers.remove(observer);
    }

    public void thongBao(String thongBao) {
        System.out.println("Lop truong thong bao: " + thongBao);
        for (Observer observer : observers) {
            observer.nhanThongBao(thongBao);
        }
    }
}
