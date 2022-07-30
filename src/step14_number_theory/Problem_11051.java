package step14_number_theory;

import java.io.*;
import java.util.*;

public class Problem_11051 {
	static final int mod = 1000000007;
	static int[] f = new int[4000001];
	static {
		f[0]=1;
	}
	
	static int mul(long a, long b) { return (int)(a*b%mod); }
	
	static long p(int a, int b) {
		if (b==0) return 1;
		long ret = p(a, b/2);
		ret = mul(ret,ret);
		if (b%2==0) return ret;
		return mul(ret,a);
	}
	
	static long C(int a, int b) {
		long ans = f[a];
		ans = mul(ans, p(f[b], mod-2));
		ans = mul(ans, p(f[a-b], mod-2));
		return ans;
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		for (int i=1; i<=a; ++i) {
			f[i] = mul(i, f[i-1]);
		}
		System.out.println(C(a,b));
	}

}
