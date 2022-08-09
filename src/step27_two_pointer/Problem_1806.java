package step27_two_pointer;

import java.util.*;

public class Problem_1806 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] arr = new int[n+1];
		int[] pref = new int[n+1];
		for (int i=1; i<=n; ++i) {
			arr[i] = sc.nextInt();
			pref[i] = arr[i] + pref[i-1];
		}
		
		int ans = n+1;
		int l=0, r=1;
		while (l<r && r<=n) {
			int sum = pref[r]-pref[l];
			if (sum>=k) {
				ans = Math.min(r-l, ans);
				++l;
			} else ++r;
		}
		System.out.println(ans==n+1 ? 0 : ans);

	}

}
