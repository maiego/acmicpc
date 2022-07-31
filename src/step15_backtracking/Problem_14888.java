package step15_backtracking;

import java.util.*;

public class Problem_14888 {
	static int n;
	static int[] arr;
	static int[] opCnt = new int[4];
	static int minv=(int)1e9, maxv=(int)-1e9;
	static int eval(int a, int b, int op) {
		if (op==0) return a+b;
		if (op==1) return a-b;
		if (op==2) return a*b;
		return a/b;
	}
	
	static void f(int prev, int idx) {
		if (idx==n) {
			if (prev < minv) minv=prev;
			if (prev > maxv) maxv=prev;
			return;
		}
		int next = arr[idx];
		for (int i=0; i<4; ++i) {
			if (opCnt[i]==0) continue;
			opCnt[i]--;
			f(eval(prev, next, i), idx+1);
			opCnt[i]++;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		arr = new int[n];
		for (int i=0; i<n; ++i) {
			arr[i] = sc.nextInt();
		}
		for (int i=0; i<4; ++i)
			opCnt[i] = sc.nextInt();
		
		f(arr[0], 1);
		System.out.println(maxv);
		System.out.println(minv);
	}

}
