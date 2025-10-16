// ================== Lớp SachGiaoTrinh ==================
public class SachGiaoTrinh extends Sach implements IKiemKe {
    private String monHoc;
    private String capDo;

    public SachGiaoTrinh(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong,
                         double giaCoBan, String monHoc, String capDo) {
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong, giaCoBan);
        this.monHoc = monHoc;
        this.capDo = capDo;
    }

    @Override
    public double tinhGiaBan() {
        int soNam = 2025 - getNamXuatBan();
        return getGiaCoBan() + (soNam * 5000);
    }

    @Override
    public boolean kiemTraTonKho(int soLuongToiThieu) {
        return getSoLuong() >= soLuongToiThieu;
    }

    @Override
    public void capNhatViTri(String viTriMoi) {
        System.out.println("📦 Đã chuyển sách "" + getTieuDe() + "" đến khu vực: " + viTriMoi);
    }

    @Override
    public String toString() {
        return "📘 Sách giáo trình {" +
                "\n  Mã sách: " + getMaSach() +
                "\n  Tiêu đề: " + getTieuDe() +
                "\n  Tác giả: " + getTacGia() +
                "\n  Năm XB: " + getNamXuatBan() +
                "\n  Số lượng: " + getSoLuong() +
                "\n  Giá cơ bản: " + getGiaCoBan() +
                "\n  Môn học: " + monHoc +
                "\n  Cấp độ: " + capDo +
                "\n  👉 Giá bán: " + tinhGiaBan() + " VNĐ" +
                "\n}";
    }
}
