package day5_thuchanh4;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap so nhan vien: ");
		int a = scanner.nextInt();
		
		NhanVien[] dsNhanVien = new NhanVien[a];
		for (int i = 0; i < dsNhanVien.length; i++) {
			Scanner nvScanner = new Scanner(System.in);
			
			dsNhanVien[i] = new NhanVien();
			
			System.out.println("Nhap ten nhan vien "+i+1+": ");
			dsNhanVien[i].hoTen = nvScanner.nextLine();
			
			System.out.println("Nhap ma nhan vien "+i+1+": ");
			dsNhanVien[i].maNV = nvScanner.nextLine();
			
			
			System.out.println("Nhap ma phong ban: ");
			dsNhanVien[i].setPhongBan(nvScanner.nextInt());
			nvScanner.nextLine();
			
			System.out.println("Nhap so dien thoai: ");
			dsNhanVien[i].setSoDT(nvScanner.nextLine());
			dsNhanVien[i].getInfor();
			
			
			
		}

	}

}
