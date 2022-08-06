package step22_parametric_search;

import java.util.*;

public class Problem_2805 {
	static int n, need;
	static long[] arr;
	
	static boolean pos(long k) {
		long acc=0;
		for (long x: arr) {
			acc += Math.max(x-k,0);
		}
		return acc>=need;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		need = sc.nextInt();
		arr = new long[n];
		long maxv = 0;
		for (int i=0; i<n; ++i) {
			arr[i] = sc.nextInt();
			if (arr[i]>maxv) maxv=arr[i];
		}
		
		long lo=0, hi=maxv+1;
		while (lo+1<hi) {
			long mid = (int)(lo+hi>>1);
			if (pos(mid)) lo=mid;
			else hi=mid;
		}
		System.out.println(lo);
	}

}
