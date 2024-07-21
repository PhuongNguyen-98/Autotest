package day5_thuchanh3;

import java.util.Iterator;
import java.util.Scanner;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int solanlap = 5;
//		int i = 0;
//		for (i = 0; i < solanlap; i++) {
//			System.out.println("i ben trong là: " + i);
//			
//			
//			
//			
//			
//			if (i == 3) {
//				break;
//			}
//		};
//		System.out.println("i ben ngoai là: " + i);
		
		
		//mảng là tập hợp 1 hoặc nhiều data có cùng KIỂU DỮ LIỆU
		// kiểu_dữ_liệu []tên_mảng = new kiểu_dữ_liệu[độ_dài_khởi_tạo]
		// vị trí của mảng luôn bắt đầu từ 0 => length - 1;
//		Scanner scanner = new Scanner(System.in);
//		int []mangInt = new int[5];
//		for (int i = 0; i < mangInt.length; i++) {
////			System.out.println("mangInt:  " + mangInt[i]);
//			System.out.println("Nhap gia tri cua mang o vi tri thu: "+i);
//			mangInt[i] = scanner.nextInt();
//			System.out.println("mangInt:  " + mangInt[i]);
//		}
		
		
		
		//scope: phạm vi tồn tại của 1 biến hehe
		
		int a = 1; // => biến ở scope lơn hơn thì có thể đc truy câp trong scope nhỏ hơn => tham chiếu đến
		if (true) {
			int b = 2;// => biến ở scope nhỏ hơn thì ko truy xuất đc từ bên ngoài scope
			if (true) {
				int c = 2;
				a = 4;
				b = 5;
			}
			int c = 5;
			System.out.println("c la: " + c);
		}
		
		System.out.println("a la: " + a);
	
	}
	
	// tạo 1 lớp con hoc sinh
	// nhap ten, tuoi
	// in học sinh đó ra
	// mong đợi in ra học sinh ten: .... tuôi là: ....
	
	//scope: phạm vi tồn tại của 1 biến hehe
	
	

}
