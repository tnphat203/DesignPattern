package src.observer.Bai1.models;

import src.observer.Bai1.observers.Observer;

/*
 * File: SinhVien
 * Author: Tran Ngoc Phat
 * Date: 3/11/2025
 */
public class SinhVien implements Observer {
    private String tenSV;

    public void setTenSV(String tenSV) {
        this.tenSV = tenSV;
    }

    public String getTenSV() {
        return tenSV;
    }

    public SinhVien(String tenSV) {
        this.tenSV = tenSV;
    }


    @Override
    public void nhanThongBao(String thongBao) {
        System.out.println(tenSV + " nhận thông báo: " + thongBao);
    }

}
