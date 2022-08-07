package step31_mst;

import java.util.*;

public class Problem_1774 {
	static int n,e;
	static int[] x,y, link;
	
	static class Item {
		int u,v;
		double dist;
	}
	
	static int find(int x) {
		return x==link[x] ? x : (link[x]=find(link[x]));
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		e = sc.nextInt();
		
		x = new int[n+1];
		y = new int[n+1];
		link = new int[n+1];
		for (int i=1; i<=n; ++i)
			link[i] = i;

		for (int i=1; i<=n; ++i) {
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
		}
		
		while (e-->0) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int x=find(a), y=find(b);
			if (x==y) continue;
			link[x]=y;
		}
		
		List<Item> edges = new ArrayList<>();
		for (int i=1; i<=n; ++i) {
			for (int j=i+1; j<=n; ++j) {
				Item item = new Item();
				item.u=i; item.v=j;
				item.dist = Math.hypot(x[i]-x[j], y[i]-y[j]);
				edges.add(item);
			}
		}
		
		edges.sort((a,b)->(a.dist<b.dist ? -1 : 1));
		
		double ans = 0;
		for (Item item: edges) {
			int x=find(item.u), y=find(item.v);
			if (x==y)
				continue;
			link[x]=y;
			ans += item.dist;
		}
		System.out.printf("%.2f\n", ans);
		
	}

}
