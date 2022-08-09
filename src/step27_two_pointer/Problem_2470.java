package step27_two_pointer;

import java.util.*;

public class Problem_2470 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] arr = new long[n];
		for (int i=0; i<n; ++i)
			arr[i] = sc.nextLong();
		Arrays.sort(arr);

		long minAbs = Long.MAX_VALUE;
		long a=0,b=0;

		int l=0, r=n-1;
		while (l<r) {
			long k = arr[l]+arr[r];
			long abs = Math.abs(k);
			if (minAbs>abs) {
				a=arr[l];
				b=arr[r];
				minAbs = abs;
			}
			if (k<=0) ++l;
			else --r;
		}
		System.out.println(a + " " + b);

	}

}
