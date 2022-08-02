package step18_greedy;

import java.util.*;

public class Problem_13305 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] dist = new int[n-1];
        int[] cost = new int[n-1];
        for (int i=0; i<n-1; ++i)
            dist[i] = sc.nextInt();
        for (int i=0; i<n-1; ++i)
            cost[i] = sc.nextInt();
        long heja=cost[0], ans=heja*dist[0];
        for (int i=1; i<n-1; ++i) {
            if (cost[i]<heja) heja=cost[i];
            ans += heja*dist[i];
        }
        System.out.println(ans);

    }

}
