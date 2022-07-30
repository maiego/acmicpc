package step14_number_theory;

import java.io.*;
import java.util.*;

public class Problem_1922 {
	static int n,m, link[];
	static List<Item> edges = new ArrayList<>();
	
	static class Item {
		int a,b,w;
	}
	
	static int find(int x) {
		return link[x]==x ? x : (link[x]=find(link[x]));
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;

		n = Integer.parseInt(br.readLine());
		link = new int[n+1];
		for (int i=1; i<=n; ++i)
			link[i]=i;

		m = Integer.parseInt(br.readLine());
		for (int i=0; i<m; ++i) {
			st = new StringTokenizer(br.readLine());
			Item item = new Item();
			item.a = Integer.parseInt(st.nextToken());
			item.b = Integer.parseInt(st.nextToken());
			item.w = Integer.parseInt(st.nextToken());
			edges.add(item);
		}
		
		Collections.sort(edges, (a,b)->a.w-b.w);
		int ans=0, cnt=0;
		for (Item e: edges) {
			int x=find(e.a), y=find(e.b);
			if (x==y) continue;
			link[x]=y;
			ans+=e.w;
			if (++cnt == n-1) break;
		}
		
		System.out.println(ans);
	}

}
