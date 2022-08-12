package step25_graph_traversal;

import java.util.*;

public class Problem_24480 {
    
    static int ord;
    static List<Integer> adj[];
    static int[] ans, vis;
    
    static void dfs(int u) {
        ans[u] = ++ord;
        vis[u] = 1;
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
        
        ans = new int[n+1];
        vis = new int[n+1];
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
            adj[i].sort((a,b)->b-a);
        
        dfs(start);

        for (int i=1; i<=n; ++i)
            sb.append(ans[i]).append('\n');
        
        System.out.println(sb);
    }

}
