package numbers;

import java.util.Scanner;

public class SpyNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("num = ");
		int num = sc.nextInt();
		
		int num1 = num;
		int sum=0;
		int temp;
		while(num!=0) {
			temp = num%10;
			sum += temp;
			num/=10;
		}
		
		System.out.println("sum = " + sum);
		
		int pro=1;
		while(num1!=0) {
			temp = num1%10;
			pro *= temp;
			num1/=10;
		}
		
		System.out.println("pro = " + pro);
		
		if(sum == pro) {
			System.out.println("it is a spy num");
		}
		else {
			System.out.println("it is not a spy num");
		}

	}

}
