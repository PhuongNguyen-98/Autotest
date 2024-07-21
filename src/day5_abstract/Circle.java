package day5_abstract;

public class Circle extends Shape {
	
	@Override
	public void draw()
	{
		System.out.println("Draw circle with a round line, user color "+getColor());
	}

}
