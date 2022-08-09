package step27_two_pointer;

import java.util.*;

public class Problem_1644 {
	static final int N = (int)4e6;
	static int[] p = new int[N+1];
	static List<Integer> primes = new ArrayList<>();
	static {
		primes.add(0);
		Arrays.fill(p, 1);
		p[0]=p[1]=0;
		for (int i=2; i*i<=N; ++i)
			if (p[i]==1) {
				for (int j=i*i; j<=N; j+=i)
					p[j]=0;
			}
		
		for (int i=2; i<=N; ++i)
			if (p[i]==1) primes.add(i);

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long x = sc.nextInt();
		int pn = primes.size();
		long[] pref = new long[pn+1];
		for (int i=1; i<pn; ++i) {
			pref[i] = primes.get(i) + pref[i-1];
		}
		
		long ans = 0;
		int l=0, r=1;
		while (l<r && r<pn) {
			long sum = pref[r]-pref[l];
			if (sum==x) ++ans;
			if (sum<x) ++r;
			else ++l;
		}
		System.out.println(ans);

	}

}
