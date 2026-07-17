package numbers;

import java.util.Scanner;

public class PerfectNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("enter num: ");
		int num = sc.nextInt();
		
		int sum=0;
		for(int i=1; i<num; i++) {
			if(num%i ==0) {
//				System.out.print(i + " ");
				sum += i;
			}
		}
//		System.out.println(sum);

		if(sum == num) {
			System.out.println("it is a perfect number");
		}
		else {
			System.out.println("it is not a perfect number");
		}
	}

}
