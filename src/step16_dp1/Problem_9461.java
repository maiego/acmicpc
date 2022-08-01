package step16_dp1;

import java.util.Scanner;

public class Problem_9461 {
	static long[] f = new long[101];
	static {
		f[1]=f[2]=f[3]=1;
		f[4]=f[5]=2;
		for (int i=6; i<=100; ++i)
			f[i]=f[i-1]+f[i-5];
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int T = sc.nextInt();
		while (T-->0) {
			int n = sc.nextInt();
			sb.append(f[n]).append('\n');
		}
		System.out.println(sb);
	}

}
