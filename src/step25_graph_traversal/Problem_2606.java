package step25_graph_traversal;

import java.util.*;

public class Problem_2606 {
    static List<Integer> adj[];
    static int[] vis;
    static int ans;
    
    static void dfs(int u) {
        vis[u] = 1;
        ++ans;
        for (int v: adj[u]) {
            if (vis[v]==1) continue;
            dfs(v);
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        vis = new int[n+1];
        adj = new List[n+1];
        for (int i=1; i<=n; ++i)
            adj[i] = new ArrayList<>();

        int e = sc.nextInt();
        while (e-->0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            adj[a].add(b);
            adj[b].add(a);
        }
        
        dfs(1);
        
        System.out.println(ans-1);

    }

}
