/*Jancarlo Sevilla
 * Module 1 - Class and Objects
 * 6/6/2020
 *COP3330C 
 */

import java.util.Scanner;//imports data to allow the user of Scanner 


public class Main {
    public static void main(String[] args) {
    	
    	//user input constructing
    	Scanner sc = new Scanner(System.in);
    	
    	//Rectangle
    	Rectangle rectangle1 = new Rectangle(4.0,5.0);//first constructor using parameters that was set
    	System.out.print("Parameters ");//clarity
        rectangle1.printRectangle();//prints
        
        Rectangle rectangle2 = new Rectangle();/*second constructor using the overloaded 0-arg setting values to 0 
        *can also place one variable and the second variable will be 0*/
        System.out.print("Default " );//clarity
        rectangle2.printRectangle();//prints
        
        //Rectangle user input - i set up user input so i can use the setters and getters
        System.out.print("Enter the Length:");
        double tempUserInput1 = sc.nextDouble();//passing value to variable variable
        System.out.print("Enter the Width:");
        double tempUserInput2 = sc.nextDouble();//passing value to variable
        
        rectangle2.setLength(tempUserInput1);//setting the variables
        rectangle2.setWidth(tempUserInput2);//setting the variables
        
        System.out.print("Inputted ");//for clarity
        rectangle2.printRectangle();//prints
    	
        
        //Circle
        Circle circle1 = new Circle(3.2);//constructor containing parameters
        System.out.print("\nParameters ");//clarity
        circle1.printCircle();
        
        Circle circle2 = new Circle();//0-arg constructor
        System.out.print("Default ");//clarity
        circle2.printCircle();
        
        //Circle user input - allows the entry of user input
        System.out.print("Enter the Radius:");
        double tempUserInput3 = sc.nextDouble();//passing value
  
        circle2.setRadius(tempUserInput3);//setting
                
        System.out.print("Inputted ");//clarity
        circle2.printCircle();//prints
        
        //end
    }
}