package text;

public class SachGiaoTrinh extends Sach {
    private String monHoc;
    private String capDo;

    public SachGiaoTrinh(String tenSach, String maSach, int namXuatBan, double giaCoBan, String monHoc, String capDo) {
        super(tenSach, maSach, namXuatBan, giaCoBan);
        this.monHoc = monHoc;
        this.capDo = capDo;
    }

    public String getMonHoc() { return monHoc; }
    public void setMonHoc(String monHoc) { this.monHoc = monHoc; }

    public String getCapDo() { return capDo; }
    public void setCapDo(String capDo) { this.capDo = capDo; }

    @Override
    public double tinhGiaBan() {
        int soNam = 2025 - namXuatBan;
        return giaCoBan + (soNam * 5000);
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Môn học: " + monHoc +
                ", Cấp độ: " + capDo +
                ", Giá bán: " + tinhGiaBan();
    }
}

