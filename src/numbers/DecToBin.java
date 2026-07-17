package numbers;

import java.util.Scanner;

public class DecToBin {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("enter num: ");
		int num = sc.nextInt();
		
		int rem = 0;
		int place = 1;
		while(num!=0) {
			int re = num%2;
			rem += (re*place);
			place *= 10;
			num /= 2; 
		}
		
		System.out.println("binary form is " + rem);

		sc.close();
	}

}
