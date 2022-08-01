package step16_dp1;

import java.util.*;

public class Problem_2565 {
	
	static class Item { int x,y; }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Item[] arr = new Item[n];
		for (int i=0; i<n; ++i) {
			arr[i] = new Item();
			arr[i].x = sc.nextInt();
			arr[i].y = sc.nextInt();
		}
		Arrays.sort(arr, (a,b)-> a.x-b.x);
		int[] dp = new int[n];
		for (int i=0; i<n; ++i) {
			dp[i]=1;
			for (int j=0; j<i; ++j) {
				if (arr[j].y<arr[i].y) {
					dp[i] = Math.max(dp[i], 1+dp[j]);
				}
			}
		}
		int ans = 0;
		for (int i=0; i<n; ++i)
			if (dp[i]>ans) ans=dp[i];
		System.out.println(n-ans);
	}

}
