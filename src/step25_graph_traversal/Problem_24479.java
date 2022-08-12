package step25_graph_traversal;

import java.util.*;

public class Problem_24479 {
    static int ord;
    static int[] ans, vis;
    
    static List<Integer> adj[];
    
    static void dfs(int u) {
        vis[u] = 1;
        ans[u] = ++ord;
        for (int v: adj[u]) {
            if (vis[v]==1) continue;
            dfs(v);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        
        int n = sc.nextInt();
        int e = sc.nextInt();
        int start = sc.nextInt();
        
        vis = new int[n+1];
        ans = new int[n+1];
        adj = new List[n+1];
        for (int i=1; i<=n; ++i)
            adj[i] = new ArrayList<>();
        
        while (e-->0) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            adj[u].add(v);
            adj[v].add(u);
        }
        
        for (int i=1; i<=n; ++i)
            Collections.sort(adj[i]);
        
        dfs(start);
        for (int i=1; i<=n; ++i)
            sb.append(ans[i]).append('\n');
        
        System.out.println(sb);

    }

}
