package tv_moe;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Scanner myObject = new Scanner(System.in);
		System.out.println("Nhap ten: ");
		String name = myObject.nextLine();
		System.out.println("Nhap tuoi: ");
		int age = myObject.nextInt();
		System.out.println("Tên: "+name + ", tuổi: "+age);
		*/
//		HocSinh hs1 = new HocSinh();
//		Scanner myObject = new Scanner(System.in);
//		System.out.println("Nhap ten: ");
//		hs1.setName(myObject.nextLine());
//		System.out.println("Nhap tuoi: ");
//		hs1.setAge(myObject.nextInt());
//		System.out.println("Tên: "+hs1.getName() + ", tuổi: "+hs1.getAge());

		// nhap dc 2 hs bang cach dung vòng lap for
		
		
		// kiểu_dữ_liệu []tên_mảng = new kiểu_dữ_liệu[độ_dài_khởi_tạo]
		Scanner s = new Scanner(System.in);
		System.out.println("Nhap so hs: ");
		int a = s.nextInt();
		
		HocSinh[] dsHocsinh = new HocSinh[a];
		for (int i = 0; i < dsHocsinh.length; i++) 
		{
			Scanner scanner = new Scanner(System.in);
//			HocSinh []hs= new HocSinh[2];
//			hs[i] = new HocSinh();
//			System.out.println("Nhap ten: ");
//			hs[i].setName(scanner.nextLine());
//			System.out.println("Nhap tuoi: ");
//			hs[i].setAge(scanner.nextInt());
//			System.out.println("Tên: "+hs[i].getName() + ", tuổi: "+hs[i].getAge());
//			
			
			/// anh nam
			dsHocsinh[i] = new HocSinh();
			System.out.println("Nhap ten hs so "+i+1+": ");
			dsHocsinh[i].setName(scanner.nextLine());
			System.out.println("Nhap tuoi hs so "+i+1+": ");
			dsHocsinh[i].setAge(scanner.nextInt());
			dsHocsinh[i].getInfo();
		}
		
		
		
		// 1 - Dev, 2 - Test, 3 - BA
		System.out.println("Nhap so hs: ");
		int inputphongban = s.nextInt();
		int sophongban;
		switch (inputphongban) {
		case 1: {
			sophongban = 1;
		}
		case 2: {
			sophongban = 2;
		}
		case 3: {
			sophongban = 3;
		}
		default:
			System.out.println("");
			break;
		}
		System.out.println("Nhap so luong: ");
		int soluong = s.nextInt();
		NhanVien[] dsNhanvien = new NhanVien[a];
		for (int i = 0; i < dsHocsinh.length; i++) 
		{
			Scanner scanner = new Scanner(System.in);	
			dsNhanvien[i] = new NhanVien();
			dsNhanvien[i].setPhongban(sophongban);
			System.out.println("Nhap tuoi hs so "+i+1+": ");
			dsNhanvien[i].setHoten(scanner.nextLine());
			
			System.out.println("Nhap tuoi hs so "+i+1+": ");
			dsNhanvien[i].maNv(scanner.nextInt());
			
			System.out.println("Nhap tuoi hs so "+i+1+": ");
			dsNhanvien[i].setSdt(scanner.nextLine());
			
			dsNhanvien[i].getInfo();
		}
		
		
		// tạo 2 class
		// 1 Phongban
		// 2 NhanVien
		
		/*
		 * Class PhongBan {
		 * 		private []Nhanvien;
		 * 
		 * 
		 * }
		 * 
		 * 
		 * */
	}

}
