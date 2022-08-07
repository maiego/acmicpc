package step31_mst;

import java.util.*;

public class Problem_1197 {
	static int n,e;
	static int[] link;
	static List<Item> edges = new ArrayList<>();
	
	static class Item {
		int u,v,w;
	}
	
	static int find(int x) {
		return x==link[x] ? x : (link[x]=find(link[x]));
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		link = new int[n+1];
		for (int i=1; i<=n; ++i)
			link[i] = i;
		
		e = sc.nextInt();
		while (e-->0) {
			Item item = new Item();
			item.u = sc.nextInt();
			item.v = sc.nextInt();
			item.w = sc.nextInt();
			edges.add(item);
		}
		
		edges.sort((a,b)->(a.w-b.w));
		
		long ans=0;
		for (Item item: edges) {
			int x=find(item.u), y=find(item.v);
			if (x==y) continue;
			ans += item.w;
			link[x] = y;
		}
		System.out.println(ans);

	}

}
