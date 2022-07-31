package step15_backtracking;

import java.util.*;

public class Problem_9663 {
	static int n, ans;
	static boolean[] row = new boolean[100];
	static boolean[] dec = new boolean[100];
	static boolean[] inc = new boolean[100];

	static void f(int idx) {
		if (idx==n) {
			++ans;
			return;
		}
		for (int i=0; i<n; ++i) {
			if (row[i]) continue;
			if (inc[i+idx]) continue;
			if (dec[i-idx+n]) continue;
			row[i]=inc[i+idx]=dec[i-idx+n]=true;
			f(idx+1);
			row[i]=inc[i+idx]=dec[i-idx+n]=false;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		f(0);
		System.out.println(ans);
	}

}
