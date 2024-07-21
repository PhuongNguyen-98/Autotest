package day5_abstract;

public class Rectangle extends Shape {
	@Override //Chu thich ghi de
	public void draw()
	{
		System.out.println("Draw rectangle with 4 edges, user color "+getColor());
	}	
}
