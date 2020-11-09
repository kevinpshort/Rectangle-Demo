package rectanglePkg;

import java.util.Scanner;

public class Rectangle2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		double width;
		double height;
		double area;
		
		System.out.print("Enter rectangle width: ");
		width = input.nextDouble();
		
		System.out.print("Enter rectangle height: ");
		height = input.nextDouble();
		
		
		//width = 2;
		//height = 3;
		area = width * height;
		
		System.out.println("W: " + width + "  H: " + height + "  A: " + area);

	}

}
