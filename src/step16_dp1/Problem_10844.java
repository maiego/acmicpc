package step16_dp1;

import java.util.*;

public class Problem_10844 {
	final static int mod=(int)1e9;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[][] dp = new int[n+1][10];
		for (int i=1; i<=9; ++i)
			dp[1][i]=1;
		for (int i=2; i<=n; ++i) {
			for (int d=1; d<=8; ++d)
				dp[i][d] = (dp[i-1][d-1]+dp[i-1][d+1])%mod;
			dp[i][0] = dp[i-1][1];
			dp[i][9] = dp[i-1][8];
		}
		int ans=0;
		for (int i=0; i<=9; ++i) {
			ans+=dp[n][i];
			ans%=mod;
		}

		System.out.println(ans);
	}

}
