package step16_dp1;

import java.util.*;

public class Problem_1463 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] dp = new int[n+1];
		
		for (int i=2; i<=n; ++i) {
			dp[i] = dp[i-1]+1;
			if (i%3==0) dp[i] = Math.min(dp[i], 1+dp[i/3]);
			if (i%2==0) dp[i] = Math.min(dp[i], 1+dp[i/2]);
		}
		System.out.println(dp[n]);
	}

}
