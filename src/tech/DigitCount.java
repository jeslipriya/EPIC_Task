package tech;

import java.util.Scanner;

public class DigitCount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter num: ");
		int num = sc.nextInt();
		
		int temp;
		int count=0;
		while(num>0) {
			temp=num%10;
			count++;
			
			num/=10;
		}
		System.out.println(count);

	}

}
