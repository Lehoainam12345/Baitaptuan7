import java.util.ArrayList;

// ================== Lớp QuanLySach ==================
public class QuanLySach {
    private ArrayList<Sach> danhSachSach = new ArrayList<>();

    public void themSach(Sach sach) {
        danhSachSach.add(sach);
    }

    public void hienThiDanhSachSach() {
        if (danhSachSach.isEmpty()) {
            System.out.println("📭 Danh sách trống!");
        } else {
            System.out.println("===== DANH SÁCH SÁCH =====");
            for (Sach s : danhSachSach) {
                System.out.println(s.toString());
                System.out.println("-------------------------");
            }
        }
    }
}
