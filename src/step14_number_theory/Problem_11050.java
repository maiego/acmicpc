package step14_number_theory;

import java.io.*;
import java.util.*;

public class Problem_11050 {
	static int[] f = new int[20];
	static {
		f[0]=1;
		for (int i=1; i<=10; ++i) {
			f[i] = i*f[i-1];
		}
	}

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println(f[a]/f[a-b]/f[b]);

	}

}
