package step16_dp1;

import java.io.*;
import java.util.*;

public class Problem_24416 {
	static int[] fib = new int[50];
	static {
		fib[1]=fib[2]=1;
		for (int i=3; i<=40; ++i)
			fib[i] = fib[i-1]+fib[i-2];
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(fib[n] + " " + (n-2));
	}

}
