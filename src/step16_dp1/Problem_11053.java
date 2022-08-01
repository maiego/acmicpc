package step16_dp1;

import java.util.*;

public class Problem_11053 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] arr = new int[n];
		int[] dp = new int[n];
		for (int i=0; i<n; ++i)
			arr[i] = sc.nextInt();
		for (int i=0; i<n; ++i) {
			dp[i]=1;
			for (int j=0; j<i; ++j) {
				if (arr[j]<arr[i])
					dp[i] = Math.max(dp[i],1+dp[j]);
			}
		}
		int ans = 0;
		for (int i=0; i<n; ++i)
			if (dp[i]>ans) ans=dp[i];
		System.out.println(ans);
	}

}
