package src.observer.Bai1;

import src.observer.Bai1.models.SinhVien;
import src.observer.Bai1.services.Lop;

/*
 * File: Main
 * Author: Tran Ngoc Phat
 * Date: 3/11/2025
 */
public class Main {
    public static void main(String[] args) {
        Lop lop = new Lop();

        SinhVien sinhVien = new SinhVien("Phat");
        SinhVien sinhVien1 = new SinhVien("Phuc");
        SinhVien sinhVien2 = new SinhVien("Vu");

        lop.attach(sinhVien);
        lop.attach(sinhVien1);
        lop.attach(sinhVien2);

        lop.notify("Lịch học ngày mai thay đổi, lớp vào học lúc 8:00 AM.");

        // Một sinh viên rời khỏi danh sách nhận thông báo
        lop.dettach(sinhVien2);

        // Lớp trưởng gửi thông báo mới
        lop.notify("Lớp có bài kiểm tra vào thứ 6.");
    }
}
