package day2;

import java.util.Scanner;

public class BTVN_Day2 {
	public static double st1,st2,st3;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Moi ban nhap so thu nhat:");
		double st1= scanner.nextDouble();
		System.out.println("Moi ban nhap so thu hai:");
		double st2= scanner.nextDouble();
		System.out.println("Moi ban nhap so thu ba:");
		double st3= scanner.nextDouble();
		double result = (st1 * st2) / st3;
		System.out.println("(st1*st2)/st3= "+result);

		double max = st1;
		if(st1 < st2) {
			max = st2;
		}
		if(st2 < st3) {
			max = st3;
		}
		System.out.println("Max: " + max);
		System.out.println("Max again: " + max);
	}
	
}
