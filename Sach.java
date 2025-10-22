package text;

public abstract class Sach {
    protected String tenSach;
    protected String maSach;
    protected int namXuatBan;
    protected double giaCoBan;

    public Sach(String tenSach, String maSach, int namXuatBan, double giaCoBan) {
        this.tenSach = tenSach;
        this.maSach = maSach;
        this.namXuatBan = namXuatBan;
        this.giaCoBan = giaCoBan;
    }

    // 👉 Phương thức trừu tượng
    public abstract double tinhGiaBan();

    // Getter/Setter
    public String getTenSach() { return tenSach; }
    public void setTenSach(String tenSach) { this.tenSach = tenSach; }

    public String getMaSach() { return maSach; }
    public void setMaSach(String maSach) { this.maSach = maSach; }

    public int getNamXuatBan() { return namXuatBan; }
    public void setNamXuatBan(int namXuatBan) { this.namXuatBan = namXuatBan; }

    public double getGiaCoBan() { return giaCoBan; }
    public void setGiaCoBan(double giaCoBan) { this.giaCoBan = giaCoBan; }

    @Override
    public String toString() {
        return "Tên sách: " + tenSach +
                ", Mã: " + maSach +
                ", Năm XB: " + namXuatBan +
                ", Giá cơ bản: " + giaCoBan;
    }
}
