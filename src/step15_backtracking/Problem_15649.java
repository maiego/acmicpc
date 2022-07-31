package step15_backtracking;

import java.io.*;
import java.util.*;

public class Problem_15649 {
	static int n,k;
	static boolean[] chosen = new boolean[10];
	static List<Integer> list = new ArrayList<>();
	static StringBuilder sb = new StringBuilder();
	
	static void f(int cnt) {
		if (cnt==k) {
			for (int x: list)
		        sb.append(x).append(' ');
			sb.append('\n');
			return;
		}
		for (int i=1; i<=n; ++i) {
			if (chosen[i]) continue;
			chosen[i] = true;
			list.add(i);
			f(cnt+1);
			list.remove(cnt);
			chosen[i] = false;
		}
	}

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		k = sc.nextInt();
		f(0);
		System.out.println(sb);
	}

}
