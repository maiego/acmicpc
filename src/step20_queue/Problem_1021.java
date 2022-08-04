package step20_queue;

import java.util.*;

public class Problem_1021 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Deque<Integer> q = new ArrayDeque<>();
		for (int i=1; i<=n; ++i)
			q.add(i);

		int m = sc.nextInt();
		int ans = 0;
		for (int i=0; i<m; ++i) {
			int x = sc.nextInt();
			int cnt=0;
			while (q.peek()!=x) {
				q.add(q.pop());
				++cnt;
			}
			ans += Math.min(cnt, q.size()-cnt);
			q.pop();
		}
		System.out.println(ans);
	}

}
