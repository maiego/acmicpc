package step25_graph_traversal;

import java.util.*;

public class Problem_24445 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int n = sc.nextInt();
        int e = sc.nextInt();
        int start = sc.nextInt();
        
        List<Integer> adj[] = new List[n+1];
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
        
        int ord = 0;
        int[] vis = new int[n+1];
        int[] ans = new int[n+1];
        Deque<Integer> q = new ArrayDeque<>();
        q.add(start);
        while (!q.isEmpty()) {
            int u = q.pop();
            if (vis[u]==1) continue;
            vis[u] = 1;
            ans[u] = ++ord;
             
            for (int v: adj[u]) {
                if (vis[v]==1) continue;
                q.add(v);
            }

        }
        
        for (int i=1; i<=n; ++i)
            sb.append(ans[i]).append('\n');
        System.out.println(sb);
    }

}
