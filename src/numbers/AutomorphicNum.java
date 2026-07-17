package numbers;

import java.util.Scanner;

public class AutomorphicNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("enter num ");
		int num = sc.nextInt();
		int original = num;
		
		int sqr = num*num;
		
		int count=0;
		while(num!=0) {
			count++;
			num/=10;
		}
		
		int power=1;
		for(int i=0; i<count; i++) {
			power = power*10;
		}
		
//		System.out.println(count);
//		System.out.println(power);
//		System.out.println(sqr);
		
		if(sqr%power == original) {
			System.out.println("it is automorphic number");
		}
		else {
			System.out.println("it is not automorphic number");
		}

	}

}
