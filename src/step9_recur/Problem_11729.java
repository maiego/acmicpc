package step9_recur;

import java.io.*;
import java.util.*;

public class Problem_11729 {
    
    static StringBuilder sb = new StringBuilder();
    
    static void hanoi(int k, int s, int e) {
        if (k==0) return;

        hanoi(k-1, s, 6-s-e);
        sb.append(s).append(' ').append(e).append('\n');
        hanoi(k-1, 6-s-e, e);
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int cnt=1;
        for (int i=2; i<=n; ++i) {
            cnt = 2*cnt+1;
        }
        sb.append(cnt).append('\n');
        hanoi(n, 1, 3);
        System.out.println(sb);
    }

}
