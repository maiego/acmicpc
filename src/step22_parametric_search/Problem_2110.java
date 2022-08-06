package step22_parametric_search;

import java.util.*;

public class Problem_2110 {
	static int n, limit;
	static int[] arr;
	
	static boolean pos(int k) {
		int i=0, cnt=1, d=1;
		while (i+d < n) {
			if (arr[i+d]-arr[i] >= k) {
				if (++cnt==limit) return true;
				i += d;
				d = 1;
			} else ++d;
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		limit = sc.nextInt();
		arr = new int[n];
		for (int i=0;i <n; ++i) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		
		int lo=0, hi=arr[n-1]+1;
		while (lo+1 < hi) {
			int mid = lo+hi>>1;
			if (pos(mid)) lo=mid;
			else hi=mid;
		}
		
		System.out.println(lo);
	}

}
