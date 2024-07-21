package day2;

public class Person {
	
	public static int a,b;
	public static void main(String[] args) {
		// TODO Auto-geneated method stub
		System.out.println("Ho va ten: Phuong Nguyen");
		System.out.println("So dien thoai: 123456789");
		System.out.println("Email: ABC@gmail.com");
		a=500;
		b=712;
		int result = a+b; // dat breakpoint tai dong can debug
		System.out.println("a + b = "+result);
		printLargerNumber(a,b);
	}
	
	public static void printLargerNumber(double st1, double st2)
	{
		if(st1>st2)
			System.out.println("So lon hon la: "+st1);
		else
			System.out.println("So lon hon la: "+st2);
	}
}