package src.noPattern.entity;

/*
 * File: NhanVien
 * Author: Tran Ngoc Phat
 * Date: 3/5/2025
 */
public class NhanVien {
    private String name;
    private eChucVu chucVu;

    public NhanVien(String name, eChucVu chucVu) {
        this.name = name;
        this.chucVu = chucVu;
    }

    public String method() {
        if (chucVu == eChucVu.NHAN_VIEN_VP) {
            return "Nhân viên văn phòng";
        } else if (chucVu == eChucVu.NHAN_VIEN_XUONG) {
            return "Nhân viên xưởng";
        } else if (chucVu == eChucVu.DOI_TRUONG) {
            return "Đội trưởng";
        } else if (chucVu == eChucVu.GIAM_DOC) {
            return "Giám đốc";
        } else if (chucVu == eChucVu.KE_TOAN_TRUONG) {
            return "Kế toán trưởng";
        } else {
            return "Chức vụ không hợp lệ";
        }
    }

}
