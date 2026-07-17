package numbers;

import java.util.Scanner;

public class HappyNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter num: ");
		int num = sc.nextInt();
		
		int temp=0;
		int sum=0;
		
		while(num != 1 && num != 4) {
			
			sum = 0;
			
			while(num !=0) {
				
				
				temp = num%10;
				sum += temp*temp;
				num/=10;
				
			}
			num = sum;
		}
		
//		System.out.println(num);
		
		if(sum ==1) {
			System.out.println("It is a happy number");
		}
		else {
			System.out.println("It is not a happy number");
		}
		

	}

}
