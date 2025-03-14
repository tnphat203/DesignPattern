package src.observer.Bai1.services;

import src.observer.Bai1.observers.Observer;

import java.util.ArrayList;
import java.util.List;

/*
 * File: LopTruong
 * Author: Tran Ngoc Phat
 * Date: 3/11/2025
 */
public class Lop {
    private List<Observer> observers = new ArrayList<>();

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void dettach(Observer observer) {
        observers.remove(observer);
    }

    public void notify(String message) {
        System.out.println("Lop truong thong bao: " + message);
        for (Observer observer : observers) {
            observer.update(message);
        }
    }
}
