package step22_parametric_search;

import java.util.*;

public class Problem_12015 {
	static int n, arr[];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		arr = new int[n+5];
		Arrays.fill(arr, (int)1e9);
		int maxIdx=0; arr[0]=0;
		for (int i=0; i<n; ++i) {
			int x = sc.nextInt();
			
			int lo=0, hi=maxIdx+2;
			while (lo+1<hi) {
				int mid = lo+hi>>1;
				if (arr[mid]<x) lo=mid;
				else hi=mid;
			}
			arr[hi] = x;
			maxIdx = Math.max(maxIdx, hi);
		}
		System.out.println(maxIdx);

	}

}
