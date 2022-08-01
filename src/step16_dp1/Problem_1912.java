package step16_dp1;

import java.io.*;
import java.util.*;

public class Problem_1912 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = null;
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n+1];
		int[] pref = new int[n+1];
		st = new StringTokenizer(br.readLine());
		for (int i=1; i<=n; ++i) {
			arr[i] = Integer.parseInt(st.nextToken());
			pref[i] = Math.max(0,pref[i-1]) + arr[i];
		}
		int maxv=(int)-1e9;
		for (int i=1; i<=n; ++i) {
			if (pref[i]>maxv) maxv=pref[i];
		}
		System.out.println(maxv);
	}

}
