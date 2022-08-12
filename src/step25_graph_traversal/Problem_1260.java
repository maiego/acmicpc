package step25_graph_traversal;

import java.util.*;

public class Problem_1260 {
    static StringBuilder sb = new StringBuilder();

    static int n;
    static List<Integer> adj[];
    static int[] vis;
    
    
    static void dfs(int u) {
        sb.append(u+" ");
        vis[u] = 1;
        for (int v: adj[u]) {
            if (vis[v]==1) continue;
            dfs(v);
        }
    }
    
    static void bfs(int start) {
        Deque<Integer> q = new ArrayDeque<>();
        q.add(start);
        while (!q.isEmpty()) {
            int u = q.pop();
            if (vis[u]==1) continue;
            vis[u] = 1;
            sb.append(u+" ");
            for (int v: adj[u]) {
                if (vis[v]==1) continue;
                q.add(v);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        n = sc.nextInt();
        int e = sc.nextInt();
        int start = sc.nextInt();
        
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
            adj[i].sort((a,b)->a-b);
        
        vis = new int[n+1];
        dfs(start);
        sb.append('\n');

        Arrays.fill(vis, 0);
        bfs(start);

        System.out.println(sb);
    }

}
