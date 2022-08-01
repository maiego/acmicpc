package step16_dp1;

import java.util.*;

public class Problem_11054 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i=0; i<n; ++i) {
			arr[i] = sc.nextInt();
		}
		
		int[] dp = new int[n];
		for (int i=0; i<n; ++i) {
			dp[i] = 1;
			for (int j=0; j<i; ++j)
				if (arr[j]<arr[i])
					dp[i] = Math.max(dp[i], dp[j]+1);
		}

		int[] dp2 = new int[n];
		for (int i=n-1; i>=0; --i) {
			for (int j=n-1; j>i; --j)
				if (arr[j]<arr[i])
					dp2[i] = Math.max(dp2[i], dp2[j]+1);
		}
		int ans=0;
		for (int i=0; i<n; ++i)
			if (dp[i]+dp2[i]>ans)
				ans = dp[i]+dp2[i];

		System.out.println(ans);
	}

}
