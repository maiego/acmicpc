package step15_backtracking;

import java.io.*;
import java.util.*;

public class Problem_15651 {
	static int n,k;
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
			list.add(i);
			f(cnt+1);
			list.remove(cnt);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		k = sc.nextInt();
		
		f(0);
		System.out.println(sb);
	}

}
