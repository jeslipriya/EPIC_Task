package numbers;

import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter num1: ");
		int a = sc.nextInt();
		
		System.out.print("Enter num2: ");
		int b = sc.nextInt();
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println();
		
//		with using 3rd variable
		
		int temp = a;
		a = b;
		b = temp;
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println();
		
//		without using 3rd var
		
		a = a+b;
		b = a-b;
		a = a-b;
		
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}

}
