package tech;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter num = ");
		int num = sc.nextInt();
		
		int temp;
		int rev=0;
		
		while(num!=0) {
			temp = num%10;
			rev = (rev*10) + temp;
			num/=10;
		}

		System.out.println("reverse " + rev);
	}

}
