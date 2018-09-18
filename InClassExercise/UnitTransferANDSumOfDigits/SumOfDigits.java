/*
 * author: Frank
 */

import java.util.Scanner;//import a Scanner

public class SumOfDigits {

	public static void main(String[] args) {
		
		System.out.print("Please input an digit between 0 and 1000: ");//hints for input
		
		Scanner input = new Scanner(System.in);//create a Scanner
		
		int number = input.nextInt();
		int sum = 0;
		
		//use loop to perform modulo one by one
		while(number > 0) {
			sum = sum + number % 10;
			number /= 10;
		}
		
		System.out.println("The sum of the digits is: " + sum);//print out the result
	}
}
