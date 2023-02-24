package CalcPackage;

import java.util.Scanner;

public class Calculator {
	
public static int add(int num1, int num2) {
	return num1 + num2;
}
public static int sub(int num1, int num2) {
	return num1 - num2;
}
public static int mul(int num1, int num2) {
	return num1 * num2;
}
public static double div(double num1, double num2) {
	if (num2 ==0) {
		throw new IllegalArgumentException("Number not divided by 0");
	} 
	return num1/num2;
}
public static void main(String[] args) {
	try (Scanner sc = new Scanner(System.in)) {
		System.out.println("Enter First number : ");
		int input = sc.nextInt();

		try (Scanner sc1 = new Scanner(System.in)) {
			System.out.println("Enter Second number : ");
			int input1 = sc1.nextInt();	
			
			System.out.println("The Addition is : " + Calculator.add(input, input1));
			System.out.println("The sustraction is : " + Calculator.sub(input, input1));
			System.out.println("The Multiplication is : " + Calculator.mul(input, input1));
			System.out.println("The Division is : " + Calculator.div(input, input1));
		}
	}
	}
}




