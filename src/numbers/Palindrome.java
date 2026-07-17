package numbers;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("num = ");
		int num = sc.nextInt();
		
		int original = num;
		int temp;
		int rev=0;
		
		System.out.println("original: " + num);
		
		while(num!=0) {
			temp = num%10;
			rev = (rev*10) + temp;
			num/=10;
		}
		
		System.out.println("Reverse: " + rev);
		
		if(original==rev) {
			System.out.println("It is palindrome");
		}
		else {
			System.out.println("It is not a palindrome");
		}
		
	}
}
