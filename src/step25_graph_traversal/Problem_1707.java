package step25_graph_traversal;

import java.util.*;

public class Problem_1707 {
	static int n;
	static List<Integer> adj[];
	static int[] vis;
	static boolean fail;
	
	static void dfs(int u, int color) {
		if (vis[u]==color) return;
		if (vis[u] != -1) {
			fail=true;
			return;
		}
		vis[u] = color;
		for (int v: adj[u]) {
			dfs(v, color^1);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int T = sc.nextInt();
		while (T-->0) {
			fail=false;
			n = sc.nextInt();
			int q = sc.nextInt();
			adj = new List[n+1];
			vis = new int[n+1];
			Arrays.fill(vis, -1);
			for (int i=1; i<=n; ++i)
				adj[i] = new ArrayList<>();

			while (q-->0) {
				int a = sc.nextInt();
				int b = sc.nextInt();
				adj[a].add(b);
				adj[b].add(a);
			}
			
			for (int i=1; i<=n; ++i)
				if (vis[i]==-1)
					dfs(i, 1);
			
			sb.append(fail ? "NO\n" : "YES\n");
		}
		System.out.println(sb);

	}

}
