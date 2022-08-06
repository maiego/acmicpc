package step22_parametric_search;

import java.util.*;

public class Problem_1300 {
	static int n,k;
	static int[] arr;
	
	static public boolean pos(int x) {
		int acc=0;
		for (int i=1; i<=n; ++i) {
			if (x<i) break;
			acc += Math.min(x/i, n);
		}
		return acc<k;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		k = sc.nextInt();

		int lo=0, hi=k;
		while (lo+1<hi) {
			int mid = lo+hi>>1;
			if (pos(mid)) lo=mid;
			else hi=mid;
		}
		System.out.println(hi);

	}

}
