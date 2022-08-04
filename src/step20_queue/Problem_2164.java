package step20_queue;

import java.util.*;

public class Problem_2164 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		int n = sc.nextInt();
		
		Deque<Integer> q = new ArrayDeque<>();
		for (int i=1; i<=n; ++i) q.add(i);
		while (q.size()>1) {
			q.pop();
			q.add(q.pop());
		}
		System.out.println(q.peek());
		
	}

}
