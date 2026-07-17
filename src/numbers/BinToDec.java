package numbers;

import java.util.Scanner;

public class BinToDec {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter num: ");
		int num = sc.nextInt();
		
		int original = num;
		
		int count=0;
		int rev=0;
		while(num!=0) {
			int temp = num%10;
			rev = (rev*10)+ temp;
			count++;
			num/=10;
		}
		System.out.println(rev);
		System.out.println(count);

		int dec=0;
		while(rev!=0) {
			int temp = rev%10;
			
			dec += temp* (int)Math.pow(2, count-1);
			count--;
			
			rev/=10;
		}
		
		
		
		System.out.println(dec);
	}

}
