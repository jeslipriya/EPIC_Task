package tech;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		System.out.print("n = ");
		n = sc.nextInt();
		
		int a=0, b=1;
		int f=0;
		
		System.out.println(a);
		System.out.println(b);
		
		for(int i=0; i<n-2; i++) {
			f = a+b;
			a = b;
			b = f;
			System.out.println(f);
		}

	}

}
