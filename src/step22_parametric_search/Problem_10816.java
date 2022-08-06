package step22_parametric_search;

import java.io.*;
import java.util.*;

public class Problem_10816 {
	static int n;
	static int[] arr;
	
	static int lower_bound(int x) {
		int lo=0, hi=n-1;
		while (lo<hi) {
			int mid = lo+hi>>1;
			if (arr[mid]>=x) hi=mid;
			else lo=mid+1;
		}
		return (arr[hi]>=x) ? hi : lo+1;
	}
	
	static int upper_bound(int x) {
		int lo=0, hi=n-1;
		while (lo<hi) {
			int mid = lo+hi>>1;
		    if (arr[mid]>x) hi=mid;
		    else lo=mid+1;
		}
		return (arr[hi]>x) ? hi : lo+1;
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = null;

		n = Integer.parseInt(br.readLine());
		arr = new int[n];
		st = new StringTokenizer(br.readLine());
		for (int i=0; i<n; ++i)
			arr[i] = Integer.parseInt(st.nextToken());
		
		Arrays.sort(arr);
		int q = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
//		System.out.println(upper_bound(1));
//		System.out.println(lower_bound(1));
		while (q-->0) {
			int x = Integer.parseInt(st.nextToken());
			int cnt = upper_bound(x) - lower_bound(x);
			System.out.print(cnt + " ");
		}

	}

}
