package src.observer.Bai1;

import src.observer.Bai1.models.SinhVien;
import src.observer.Bai1.services.LopTruong;

/*
 * File: Main
 * Author: Tran Ngoc Phat
 * Date: 3/11/2025
 */
public class Main {
    public static void main(String[] args) {
        LopTruong lopTruong = new LopTruong();

        SinhVien sinhVien = new SinhVien("Phat");
        SinhVien sinhVien1 = new SinhVien("Phuc");
        SinhVien sinhVien2 = new SinhVien("Vu");

        lopTruong.add(sinhVien);
        lopTruong.add(sinhVien1);
        lopTruong.add(sinhVien2);

        lopTruong.thongBao("Lịch học ngày mai thay đổi, lớp vào học lúc 8:00 AM.");

        // Một sinh viên rời khỏi danh sách nhận thông báo
        lopTruong.remove(sinhVien2);

        // Lớp trưởng gửi thông báo mới
        lopTruong.thongBao("Lớp có bài kiểm tra vào thứ 6.");
    }
}
