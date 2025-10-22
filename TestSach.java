package text;
public class TestSach {
    public static void main(String[] args) {
        QuanLySach ql = new QuanLySach();

        Sach s1 = new SachGiaoTrinh("Lập trình Java", "GT01", 2020, 120000, "CNTT", "Đại học");
        Sach s2 = new SachGiaoTrinh("Toán cao cấp", "GT02", 2019, 95000, "Toán học", "Phổ thông");

        Sach s3 = new SachTieuThuyet("Harry Potter", "TT01", 2021, 150000, "Kỳ ảo", true);
        Sach s4 = new SachTieuThuyet("Doraemon", "TT02", 2018, 80000, "Thiếu nhi", false);

        ql.themSach(s1);
        ql.themSach(s2);
        ql.themSach(s3);
        ql.themSach(s4);

        System.out.println("=== DANH SÁCH SÁCH ===");
        ql.hienThiDanhSach();

        System.out.println("\n=== TÌM KIẾM MÃ TT01 ===");
        System.out.println(ql.timKiem("TT01"));

        System.out.println("\n=== XÓA SÁCH MÃ TT02 ===");
        ql.xoaSach("TT02");
        ql.hienThiDanhSach();
    }
}
