package numbers;

import java.util.Scanner;

public class LCM {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        int lcm = (a * b) / GCD.gcd(a, b);

        System.out.println("LCM = " + lcm);

        sc.close();
    }
}