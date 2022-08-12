package step25_graph_traversal;

import java.util.*;

public class Problem_24444 {
    
    static class Item {
        int u, cnt;
        Item(int a, int b) {
            u=a; cnt=b;
        }
    }

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
            Collections.sort(adj[i]);
        
        Deque<Item> q = new ArrayDeque<>();
        q.add(new Item(start, 1));
        int[] vis = new int[n+1];
        int[] ans = new int[n+1];
        int ord=0;
        while (!q.isEmpty()) {
            Item item = q.pop();
            if (vis[item.u]>0) continue;
            vis[item.u] = item.cnt; 
            ans[item.u] = ++ord;
            for (int v: adj[item.u]) {
                q.add(new Item(v, item.cnt+1));
            }
        }
        
        for (int i=1; i<=n; ++i)
            sb.append(ans[i]).append('\n');
        System.out.println(sb);
    }

}
