package step23_priority_queue;

import java.util.*;

public class Problem_1927 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n = sc.nextInt();
		Queue<Integer> q = new PriorityQueue<>();
		while (n-->0) {
			int x = sc.nextInt();
			if (x==0) {
				sb.append(q.isEmpty() ? 0 : q.poll()).append('\n');
			} else q.add(x);
		}
		System.out.println(sb);
	}

}
