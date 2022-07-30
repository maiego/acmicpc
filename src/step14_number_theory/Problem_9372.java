package step14_number_theory;

import java.io.*;
import java.util.*;

public class Problem_9372 {
	
	static int n,e, link[];
	static List<Item> edges = new ArrayList<>();
	
	static class Item { int a,b,w; }
	
	static int find(int x) { return link[x]==x ? x : (link[x]=find(link[x])); };

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		
		st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		e = Integer.parseInt(st.nextToken());
		link = new int[n+1];
		for (int i=0; i<=n; ++i) link[i]=i;
		for (int i=0; i<e; ++i) {
			st = new StringTokenizer(br.readLine());
			Item item = new Item();
			item.a = Integer.parseInt(st.nextToken());
			item.b = Integer.parseInt(st.nextToken());
			item.w = Integer.parseInt(st.nextToken());
			edges.add(item);
		}
		edges.sort((a,b)->a.w-b.w);
		long ans=0, cnt=0;
		for (Item item : edges) {
			int x=find(item.a), y=find(item.b);
			if (x==y) continue;
			link[x]=y;
			ans+=item.w;
			if (++cnt==n-1) break;
		}
		System.out.println(ans);
	}

}
