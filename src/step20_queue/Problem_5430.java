package step20_queue;

import java.util.*;

public class Problem_5430 {
	static Deque<Integer> q = new ArrayDeque<>();
	static boolean popBack;

	static boolean process(String cmd) {
		popBack = false;
		for (char c : cmd.toCharArray()) {
			if (c == 'R') {
				popBack ^= true;
			} else if (c == 'D') {
				if (q.isEmpty())
					return true;
				if (popBack)
					q.pollLast();
				else
					q.pollFirst();
			}
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int T = sc.nextInt();
		while (T-- > 0) {
			String cmd = sc.next();
			int n = sc.nextInt();
			String[] line = sc.next().split("\\[|\\]|,");
			for (int i = 0; i < n; ++i)
				q.add(Integer.parseInt(line[i + 1]));
			if (process(cmd)) {
				sb.append("error\n");
				q.clear();
			} else {
				sb.append('[');
				if (popBack)
					while (q.size() > 1)
						sb.append(q.pollLast() + ",");
				else
					while (q.size() > 1)
						sb.append(q.pollFirst() + ",");
				if (!q.isEmpty())
					sb.append(q.pop());
				sb.append("]\n");
			}
		}
		System.out.println(sb);

	}

}
