/*
 * author: Frank
 */


import java.util.Scanner;//import Scanner

public class InchesToMetres {

	public static void main(String[] args) {
		System.out.print("Input a value for inches: ");//hints for input
		
		Scanner input = new Scanner(System.in);//Create a Scanner
		
		double inch = input.nextDouble();//obtain the input value
		double metre = inch * 0.0254;//to transfer inch in to metre
		
		System.out.println(inch + " inch = " + metre + " metres");//print the result
	}
}
