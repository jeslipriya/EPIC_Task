package numbers;

import java.util.Scanner;

public class DigitCount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter num: ");
		int num = sc.nextInt();
		
		int count=0;
		while(num>0) {
			count++;
			
			num/=10;
		}
		System.out.println(count);

	}

}
