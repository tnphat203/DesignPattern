package src.state.main;


import src.state.entity.DoiTruong;
import src.state.entity.NhanVien;
import src.state.entity.NhanVienVP;

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
