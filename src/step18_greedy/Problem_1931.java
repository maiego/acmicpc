package step18_greedy;

import java.util.*;

public class Problem_1931 {
    
    static class Item { int s,e; }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Item[] arr = new Item[n];
        for (int i=0; i<n; ++i) {
            arr[i] = new Item();
            arr[i].s = sc.nextInt();
            arr[i].e = sc.nextInt();
        }
        Arrays.sort(arr, (a,b)->{
            if (a.e==b.e) return a.s-b.s;
            return a.e-b.e;
        });
        int cnt=0;
        int e = -1;
        for (int i=0; i<n; ++i) {
            if (arr[i].s < e) continue;
            ++cnt;
            e = arr[i].e;
        }
        System.out.println(cnt);

    }

}
