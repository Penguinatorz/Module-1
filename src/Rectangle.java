class Rectangle 
{
	//fields
	private double length;
	private double width;
	
	//setters for length and width
	public void setLength(double lengthValue)
	{
		length = lengthValue;
	}
	
	public void setWidth(double widthValue)
	{
		width = widthValue;
	}
	
	//getters for length and width
	public double getLength()
	{
		return length;
	}
	
	public double getWidth()
	{
		return width;
	}
	
	//Constructors
	public Rectangle(double lengthValue, double widthValue)//accepts both the parameter length and width if user inputs in both variables
	{
		length = lengthValue;
		width = widthValue;
	}
	
	public Rectangle(double lengthValue)//accepts the parameter length if user inputs in only length variables
	{
		length = lengthValue;
		width = 0;
	}
	
	public Rectangle()//if user places nothing in 
	{
		length = 0;
		width = 0;
	}
	
	
	//method
	private double computeArea()//calculates area without using parameters
	{
		return width*length;
	}
	
	void printRectangle()//prints
	{
		System.out.println("Rectangle with sides " + length + " and " + width + " and its area is " + computeArea());
	}
	
	
	
	
}







