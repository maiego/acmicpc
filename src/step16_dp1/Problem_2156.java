package step16_dp1;

import java.util.*;
import java.io.*;

public class Problem_2156 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[10001];
		int[] dp = new int[10001];
		for (int i=0; i<n; ++i)
			arr[i] = Integer.parseInt(br.readLine());
		dp[0] = arr[0];
		dp[1] = arr[0]+arr[1];
		dp[2] = Math.max(arr[0], arr[1]) + arr[2];
		dp[2] = Math.max(dp[2], dp[1]);
		for (int i=3; i<n; ++i) {
			dp[i] = arr[i] + Math.max(dp[i-2], dp[i-3]+arr[i-1]);
			dp[i] = Math.max(dp[i-1], dp[i]);
		}
		System.out.println(dp[n-1]);
	}

}
