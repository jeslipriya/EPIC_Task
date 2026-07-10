package tech;

import java.util.Scanner;

public class Armstrong {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("num = ");
		int num = sc.nextInt();
		
		int original = num;
		int temp;
		int arm =0;
		
		System.out.println("num = " + num);

		while(num!=0) {
			temp = num%10;
			arm += (temp*temp*temp);
			num/=10;
		}
		
		System.out.println("Armstrong = " + arm);
		
		if(original==arm) {
			System.out.println("It is armstrong number");
		}
		else {
			System.out.println("It is not armstrong number");
		}
	}
	
}
