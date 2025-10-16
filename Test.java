// ================== Lớp Test ==================
public class Test {
    public static void main(String[] args) {
        QuanLySach ql = new QuanLySach();

        SachGiaoTrinh sgk = new SachGiaoTrinh("GT01", "Cấu trúc dữ liệu", "Nguyễn Văn A", 2021, 10,
                50000, "CNTT", "Đại học");
        SachTieuThuyet tth = new SachTieuThuyet("TT01", "Doraemon", "Fujiko Fujio", 1995, 20,
                40000, "Phiêu lưu", true);

        ql.themSach(sgk);
        ql.themSach(tth);

        ql.hienThiDanhSachSach();

        System.out.println("\n===== KIỂM TRA GIAO DIỆN IKiemKe =====");
        IKiemKe kiemKe = new SachGiaoTrinh("GT02", "Giải tích 1", "Trần Thị B", 2020, 80,
                55000, "Toán học", "Đại học");

        System.out.println("Tồn kho >= 100? " + kiemKe.kiemTraTonKho(100));
        kiemKe.capNhatViTri("Kho A1 - Kệ 5");
    }
}
