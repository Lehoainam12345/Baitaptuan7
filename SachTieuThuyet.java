// ================== Lớp SachTieuThuyet ==================
public class SachTieuThuyet extends Sach implements IKiemKe {
    private String theLoai;
    private boolean laSachSeries;

    public SachTieuThuyet(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong,
                          double giaCoBan, String theLoai, boolean laSachSeries) {
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong, giaCoBan);
        this.theLoai = theLoai;
        this.laSachSeries = laSachSeries;
    }

    @Override
    public double tinhGiaBan() {
        return getGiaCoBan() + (laSachSeries ? 15000 : 0);
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
        return "📖 Sách tiểu thuyết {" +
                "\n  Mã sách: " + getMaSach() +
                "\n  Tiêu đề: " + getTieuDe() +
                "\n  Tác giả: " + getTacGia() +
                "\n  Năm XB: " + getNamXuatBan() +
                "\n  Số lượng: " + getSoLuong() +
                "\n  Giá cơ bản: " + getGiaCoBan() +
                "\n  Thể loại: " + theLoai +
                "\n  Series: " + (laSachSeries ? "Có" : "Không") +
                "\n  👉 Giá bán: " + tinhGiaBan() + " VNĐ" +
                "\n}";
    }
}
