package step23_priority_queue;

import java.util.*;

public class Problem_11286 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		Queue<Integer> q = new PriorityQueue<>((a,b)->{
			int aa=Math.abs(a), bb=Math.abs(b);
			return aa==bb ? a-b : aa-bb;
		});
		int n = sc.nextInt();
		while (n-->0) {
			int x = sc.nextInt();
			if (x==0) {
				sb.append(q.isEmpty() ? 0 : q.poll()).append('\n');
			} else q.add(x);
		}

		System.out.println(sb);
	}

}
