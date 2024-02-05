/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef {
	public static void main(String[] args) throws java.lang.Exception {
		// your code goes here
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of times you want to find GC and LCM:");
		int n = input.nextInt();

		while (n > 0) {
			System.out.println("Enter the two numbers:");
			int A = input.nextInt();
			int B = input.nextInt();
			int Gcd = GCD(A, B);
			int Lcm = LCM(A, B);
			System.out.print(Gcd + " " + Lcm);
			System.out.println();
			n--;

		}

	}

	static int GCD(int a, int b) {
		int i;
		for (i = a < b ? a : b; i >= 1; i--) {
			if (a % i == 0 && b % i == 0)
				break;
		}
		return i;
	}

	static int LCM(int a, int b) {
		int i;
		for (i = a > b ? a : b; i < a * b; i = i + a > b ? a : b) {
			if (i % a == 0 && i % b == 0)
				break;
		}
		return i;
	}

}
