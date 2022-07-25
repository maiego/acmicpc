package step7_math1;

import java.io.*;

public class Problem_1193 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int lo=0, hi=6000;
		while (lo+1<hi) {
			int mid = lo+hi>>1;
			if (n<=mid*(mid+1)/2) hi=mid;
			else lo=mid;
		}
		int sum = hi+1;
		int k = (hi+1)*(hi)/2 - n + 1;
		if (lo%2==0)
			System.out.printf("%d/%d", k, sum-k);
		else
			System.out.printf("%d/%d", sum-k, k);
	}

}
