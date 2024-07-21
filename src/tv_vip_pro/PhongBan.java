package tv_vip_pro;

import java.util.ArrayList;
import java.util.List;

public class PhongBan {
	private String tenPhongBan;
	private int maPhongBan;
	private List<NhanVien> danhSachNhanVien;
	private int soLuongNhanVien = 0;
	
	public String getTenPhongBan() {
		return tenPhongBan;
	}

	public void setTenPhongBan(int maPhongBan) {
		if (maPhongBan > 4) {
			System.out.println("Loi ma phong ban");
			return;
		}
		switch (maPhongBan) {
		case 1:
			this.tenPhongBan = "DevOps";
			break;
		case 2:
			this.tenPhongBan = "Tester Quen";
			break;
		case 3:
			this.tenPhongBan = "Dev";
			break;
		default:
			System.out.println("Ma ko hop le.");
			break;
		}
		this.maPhongBan = maPhongBan;
		this.danhSachNhanVien = new ArrayList<NhanVien>();
	}

	public void getDanhSachNhanVien() {
		for (int i = 0; i < this.danhSachNhanVien.size(); i++) {
			System.out.println(this.danhSachNhanVien.get(i).ten);
		}
	}
	
	public void themNhanVien(NhanVien nv) {
		this.soLuongNhanVien++;
		this.danhSachNhanVien.add(nv);
	}
}
