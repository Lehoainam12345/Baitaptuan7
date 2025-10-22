package text;

public class SachTieuThuyet extends Sach {
    private String theLoai;
    private boolean laSachSeries;

    public SachTieuThuyet(String tenSach, String maSach, int namXuatBan, double giaCoBan, String theLoai, boolean laSachSeries) {
        super(tenSach, maSach, namXuatBan, giaCoBan);
        this.theLoai = theLoai;
        this.laSachSeries = laSachSeries;
    }

    public String getTheLoai() { return theLoai; }
    public void setTheLoai(String theLoai) { this.theLoai = theLoai; }

    public boolean isLaSachSeries() { return laSachSeries; }
    public void setLaSachSeries(boolean laSachSeries) { this.laSachSeries = laSachSeries; }

    @Override
    public double tinhGiaBan() {
        if (laSachSeries)
            return giaCoBan + 15000;
        else
            return giaCoBan - 15000;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Thể loại: " + theLoai +
                ", Là series: " + laSachSeries +
                ", Giá bán: " + tinhGiaBan();
    }
}
