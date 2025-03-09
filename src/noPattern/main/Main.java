package src.noPattern.main;

import src.noPattern.entity.NhanVien;
import src.noPattern.entity.eChucVu;

/*
 * File: Main
 * Author: Tran Ngoc Phat
 * Date: 3/5/2025
 */
public class Main {
    public static void main(String[] args) {
        NhanVien nhanVien = new NhanVien("Phat", eChucVu.DOI_TRUONG);
        System.out.println(nhanVien.method());
    }
}
