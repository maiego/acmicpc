package step16_dp1;

import java.util.*;

public class Problem_12865 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] w = new int[n];
		int[] v = new int[n];
		int[] dp = new int[k+1];
		for (int i=0; i<n; ++i) {
			w[i] = sc.nextInt();
			v[i] = sc.nextInt();
		}
		for (int i=0; i<n; ++i) {
			for (int j=k-w[i]; j>=0; --j)
				dp[j+w[i]] = Math.max(dp[j+w[i]], dp[j]+v[i]);
		}
		System.out.println(dp[k]);
	}

}
