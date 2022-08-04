package step20_queue;

import java.io.*;
import java.util.*;

public class Problem_10866 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		Deque<Integer> q = new ArrayDeque<>();
		while (n-- > 0) {
			String[] line = br.readLine().split(" ");
			String cmd = line[0];
			if (cmd.equals("push_front")) {
				int x = Integer.parseInt(line[1]);
				q.push(x);
			} else if (cmd.equals("push_back")) {
				int x = Integer.parseInt(line[1]);
				q.add(x);
			} else if (cmd.equals("pop_front")) {
				if (q.isEmpty()) {
					System.out.println("-1");
				} else {
					System.out.println(q.pollFirst());
				}
			} else if (cmd.equals("pop_back")) {
				if (q.isEmpty()) {
					System.out.println("-1");
				} else {
					System.out.println(q.pollLast());
				}
			} else if (cmd.equals("size")) {
				System.out.println(q.size());
			} else if (cmd.equals("empty")) {
				System.out.println((q.isEmpty() ? 1 : 0));
			} else if (cmd.equals("front")) {
				if (q.isEmpty()) {
					System.out.println("-1");
				} else {
					System.out.println(q.peekFirst());
				}
			} else if (cmd.equals("back")) {
				if (q.isEmpty()) {
					System.out.println("-1");
				} else {
					System.out.println(q.peekLast());
				}
			}

		}

	}

}
