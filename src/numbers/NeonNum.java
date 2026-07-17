package numbers;

import java.util.Scanner;

public class NeonNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter num: ");
		int num = sc.nextInt();
		
		
		
		int sqr = num*num;

		System.out.println("num " + num);
		int temp;
		int sum=0;
		while(sqr!=0) {
			temp = sqr%10;
			sum +=temp;
			sqr/=10;
		}
		
		System.out.println("sum " + sum);
		
		if(num == sum) {
			System.out.println("it is a neon number");
		}
		else {
			System.out.println("it is not a neon number");
		}
		
	}

}
