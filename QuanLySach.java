package text;

import java.util.ArrayList;

public class QuanLySach {
    private ArrayList<Sach> dsSach;

    public QuanLySach() {
        dsSach = new ArrayList<>();
    }

    public void themSach(Sach s) {
        dsSach.add(s);
    }

    public void xoaSach(String maSach) {
        dsSach.removeIf(s -> s.getMaSach().equalsIgnoreCase(maSach));
    }

    public Sach timKiem(String maSach) {
        for (Sach s : dsSach) {
            if (s.getMaSach().equalsIgnoreCase(maSach))
                return s;
        }
        return null;
    }

    public void hienThiDanhSach() {
        for (Sach s : dsSach) {
            System.out.println(s.toString());
        }
    }
}

