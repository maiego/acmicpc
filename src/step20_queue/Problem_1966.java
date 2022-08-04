package step20_queue;

import java.util.*;

public class Problem_1966 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while (T-- > 0) {
			int n = sc.nextInt();
			int target = sc.nextInt();
			Deque<Integer> q = new ArrayDeque<>();	//우선순위
			Deque<Integer> q2 = new ArrayDeque<>(); //주어진 상태에서 index
			Integer[] sorted = new Integer[n];
			for (int i=0; i<n; ++i) {
				int a = sc.nextInt();
				q.add(a); q2.add(i);
				sorted[i]=a;
			}
			int ans=0;
			Arrays.sort(sorted, (a,b)->b-a);
			for (int i=0; i<n; ++i) {
				int x,idx;
				while (true) {
					x = q.pop();
					idx = q2.pop();
					if (x==sorted[i]) break;
					q.add(x); q2.add(idx);
				}
				if (idx==target) {
					ans=i+1;
					break;
				}
			}
			System.out.println(ans);
		}
	}

}
