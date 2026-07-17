package numbers;

import java.util.Scanner;

public class StrongNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter num = ");
		int num = sc.nextInt();
		
		int original = num;
		int temp;
		
		int sum=0;
		
		while(num!=0) {
			int fact = 1;
			
			temp = num%10;
			for(int i=1; i<=temp; i++) {
				fact *= i;
			}
			
			sum += fact;
			num = num/10;
		}
		
		System.out.println(sum);
		
		if(original == sum) {
			System.out.println("it is strong number");
		}
		else {
			System.out.println("it is not strong number");
		}

	}

}
