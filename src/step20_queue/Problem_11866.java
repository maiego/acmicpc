package step20_queue;

import java.util.*;

public class Problem_11866 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		Deque<Integer> q = new ArrayDeque<>();
		for (int i=1; i<=n; ++i)
			q.add(i);
		
		List<Integer> list = new ArrayList<>();
		while (!q.isEmpty()) {
			for (int i=0; i<k-1; ++i) {
				q.add(q.pop());
			}
			list.add(q.pop());
		}
		System.out.print('<');
		System.out.print(list.get(0));
		for (int i=1; i<list.size(); ++i)
			System.out.print(", " + list.get(i));
		System.out.println('>');
	}

}
