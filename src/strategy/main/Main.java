package src.strategy.main;


import src.strategy.entity.DoiTruong;
import src.strategy.entity.NhanVien;
import src.strategy.entity.NhanVienVP;

public class Main {
    public static void main(String[] args) {
        NhanVien nhanVien = new NhanVien("Tran Ngoc Phat", new DoiTruong());
        System.out.println(nhanVien.getChucVu().method());

        nhanVien.setChucVu(new NhanVienVP());
        System.out.println(nhanVien.getChucVu().method());

        nhanVien.setChucVu(new DoiTruong());
        System.out.println(nhanVien.getChucVu().method());


    }
}
