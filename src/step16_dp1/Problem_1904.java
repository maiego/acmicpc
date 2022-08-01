package step16_dp1;

import java.util.Scanner;

public class Problem_1904 {
	static int[] f = new int[1000001];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		f[1]=1; f[2]=2;
		for (int i=3; i<=n; ++i)
			f[i]=(f[i-1]+f[i-2])%15746;
		System.out.println(f[n]);
	}

}
