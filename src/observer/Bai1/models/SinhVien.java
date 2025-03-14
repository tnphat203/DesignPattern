package src.observer.Bai1.models;

import src.observer.Bai1.observers.Observer;

/*
 * File: SinhVien
 * Author: Tran Ngoc Phat
 * Date: 3/11/2025
 */
public class SinhVien implements Observer {
    private String name;

    public SinhVien(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println("Sinh vien " + name + " nhan duoc thong bao: " + message);
    }

}
