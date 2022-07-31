package step15_backtracking;

import java.util.*;

public class Problem_15652 {
	static int n,k;
	static StringBuilder sb = new StringBuilder();
	static List<Integer> list = new ArrayList<>();
	
	static void f(int cnt) {
		if (cnt == k) {
			for (int x: list)
				sb.append(x).append(' ');
			sb.append('\n');
			return;
		}
		int last = cnt==0 ? 1 : list.get(cnt-1);
		for (int i=last; i<=n; ++i) {
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
