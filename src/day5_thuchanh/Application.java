package day5_thuchanh;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HinhTron ht1 = new HinhTron();
		ht1.setTenHinh("Hinh tron ");
		ht1.banKinh = 15;
		System.out.println(ht1.getTenHinh()+ht1.tinhDienTich());
		
		HinhChuNhat hcn1 = new HinhChuNhat();
		hcn1.setTenHinh("Hinh chu nhat");
		hcn1.chieuDai = 4;
		hcn1.chieuRong = 12;
		System.out.println(hcn1.getTenHinh() + hcn1.tinhDienTich());

	}

}
