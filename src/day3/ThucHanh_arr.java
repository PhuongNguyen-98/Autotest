package day3;

import java.util.Scanner;

public class ThucHanh_arr {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		nhapMang(10);
	}

	public static void nhapMang(int doDaiMang)
	{
		Scanner scanner = new Scanner(System.in);
		int []mangSoNguyen = new int[doDaiMang];
		for (int i=0; i< doDaiMang; i++ )
		{
			System.out.println("Nhap gia tri cua mang o vi tri thu: "+i);
			mangSoNguyen[i] = scanner.nextInt();
		}
		InMang(mangSoNguyen);
		timGiaTriLonNhat(mangSoNguyen);
	}
	public static void InMang(int []mangSoNguyen) {
		System.out.println("Do dai length cua mang: "+ mangSoNguyen.length);
		System.out.println("Cac gia tri cua mang vua nhap la: ");
		for (int i=0;i< mangSoNguyen.length; i++) 
		{
			System.out.print(mangSoNguyen[i]+" ");
		}
	}
	
	public static void timGiaTriLonNhat(int[] mangSoNguyen) 
	{
		int soLonNhat=0;
		for (int i=0; i< mangSoNguyen.length; i++)
		{
			if(soLonNhat<mangSoNguyen[i]) soLonNhat = mangSoNguyen[i];
		}
		System.out.println("Gia tri lon nhat cua mang la: "+ soLonNhat);
	}
	
	/*public static void sapXepmangTangDan(int[] mangSoNguyen)
	{
		for (int i=0; i< mangSoNguyen.length; i++)
			for (int j=i+1; j<mangSoNguyen.length;j++)
	}
	*/
	
	
	
	
	
	
	/*public static void inCacSoChanNhoHon11()
	{
		for (int i=0; i<=10; i++)
		{
			if (i%2==0)
				System.out.println("Gia tri cua i là: " +i);
		}				
	}
	
	public static void inCacSoChiaHetCho5NhoHon100()
	{
		for (int i=0; i<=100; i++)
		{
			if (i%5==0)
				System.out.println("Gia tri cua i là: " +i);
		}
	}
	*/
	
}

