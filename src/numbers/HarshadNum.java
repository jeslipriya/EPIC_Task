package numbers;

import java.util.Scanner;

public class HarshadNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("enter num = ");
		int num = sc.nextInt();
		
		int original = num;
		
		int temp;
		int sum=0;
		while(num!=0) {
			temp = num%10;
			sum += temp;
			num/=10;
		}
		
		System.out.println("sum = " + sum);
		
		if(original%sum == 0) {
			System.out.println("it is a harshad num");
		}
		else {
			System.out.println("it is not a harshad num");
		}

	}

}
