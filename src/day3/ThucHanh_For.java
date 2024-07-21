package day3;

public class ThucHanh_For {
	public static void inCacSoChanNhoHon11()
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		inCacSoChanNhoHon11();
		inCacSoChiaHetCho5NhoHon100();
	}

}
