package step23_priority_queue;

import java.util.*;

public class Problem_1655 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Queue<Integer> small = new PriorityQueue<>((a,b)->b-a);
		Queue<Integer> big = new PriorityQueue<>();
		int n = sc.nextInt();
		while (n-->0) {
			int x = sc.nextInt();
			if (small.isEmpty() || small.peek()>=x) small.add(x);
			else big.add(x);
			
			while (big.size()>small.size())
				small.add(big.poll());
			while (big.size()+1<small.size())
				big.add(small.poll());
				
			System.out.println(small.peek());
		}

	}

}
