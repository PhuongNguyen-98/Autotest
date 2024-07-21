package day3;

import java.util.Scanner;

public class ThucHanh_Return {
	
	public static int returnLargerNumber ( int x, int y)
	{
		if (x>y) return x;
		else return y;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Moi ban nhap so thu nhat:");
		double x= scanner.nextDouble();	
		System.out.println("Moi ban nhap so thu hai:");
		int y= scanner.nextInt();
	double result = returnLargerNumber((int)x,y);
	System.out.println("So lon hon la:" +result);

	}

}
