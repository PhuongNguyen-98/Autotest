package tv_vip_pro;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PhongBan pb1 = new PhongBan();
		pb1.setTenPhongBan(1);
		
		NhanVien nv1 = new NhanVien();
		nv1.ten = "a";
		
		NhanVien nv2 = new NhanVien();
		nv2.ten = "bn";
		
		pb1.themNhanVien(nv1);
		pb1.themNhanVien(nv2);
		pb1.getDanhSachNhanVien();
	}

}
