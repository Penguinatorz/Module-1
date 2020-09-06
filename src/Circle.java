
public class Circle 
{
	private double radius;
	private static double Pi = 3.141592653589793;
	
	//setter
	public void setRadius(double radiusValue)
	{
		radius = radiusValue;
	}
	
	//getter
	public double getRadius(double radiusValue)
	{
		return radius;
	}
	
	//method
	public double computeArea()
	{
		return Pi * radius * radius;
	}
	
	//constructor
	public Circle(double radiusValue)//accepts parameters
	{
		radius = radiusValue;
	}
	
	public Circle()//0-arg constructor
	{
		radius = 0.0;
	}
	
	void printCircle()//prints
	{
		System.out.println("Circle with radius of " + radius + " and its area is " + computeArea());
	}
	
	
}


