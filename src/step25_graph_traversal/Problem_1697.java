package step25_graph_traversal;

import java.util.*;

public class Problem_1697 {
	
	static class Item {
		int x, cnt;
		Item(int a, int b) {
			x=a; cnt=b;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		int ans=0;
		Deque<Item> q = new ArrayDeque<>();
		boolean[] vis = new boolean[200000];
		q.add(new Item(n,0));
		while (!q.isEmpty()) {
			Item item = q.pop();
			int x = item.x;
			if (vis[x]) continue;
			if (x==k) {
				ans = item.cnt;
				break;
			}

			if (vis[x]) continue;
			vis[x] = true;
			
			if (x-1>=0 && !vis[x-1])
			    q.add(new Item(x-1, item.cnt+1));
			if (x+1<200000 && !vis[x+1])
				q.add(new Item(x+1, item.cnt+1));
			if (2*x<200000 && !vis[x*2])
			    q.add(new Item(x*2, item.cnt+1));
		}
		System.out.println(ans);
	}

}
