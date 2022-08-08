package step30_union_find;

import java.util.*;

public class Problem_4195 {
	static StringBuilder sb = new StringBuilder();
	static int[] link, sz;
	
	static int find(int x) {
		return x==link[x] ? x : (link[x]=find(link[x]));
	}
	
	static void unite(int a, int b) {
		int x=find(a), y=find(b);
		if (x!=y) {
			if (sz[x]>sz[y]) {
				int tmp=x;
				x=y; y=tmp;
			}
			link[x]=y;
			sz[y]+=sz[x];
		}
		sb.append(sz[y]).append('\n');
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while (T-->0) {
			int n = sc.nextInt();
			sz = new int[2*n+1];
			Arrays.fill(sz, 1);
			link = new int[2*n+1];
			for (int i=1; i<=2*n; ++i)
				link[i] = i;
			Map<String, Integer> m = new HashMap<>();
			int id=1;
			for (int i=0; i<n; ++i) {
				String s1=sc.next(), s2=sc.next();
				int a = m.getOrDefault(s1, id);
				if (a==id) ++id;
				m.put(s1, a);
				int b = m.getOrDefault(s2, id);
				if (b==id) ++id;
				m.put(s2, b);
				unite(a,b);
			}
		}
		System.out.println(sb);

	}

}
