package step8_math2;

import java.io.*;
import java.util.*;

public class Problem_9020 {
    static int[] p = new int[10100];
    static {
        Arrays.fill(p, 1);
        p[0]=p[1]=0;
        for (int i=2; i<=1000; ++i)
            if (p[i]==1)
                for (int j=i*i; j<=10000; j+=i)
                    p[j]=0;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        while (T-->0) {
            int n = Integer.parseInt(br.readLine());
            int k = 2;
            for (int i=n/2; i>=2; --i) {
                if (p[i]==1 && p[n-i]==1) {
                    k=i;
                    break; 
                }
            }
            sb.append(k).append(' ').append(n-k).append('\n');
        }
        System.out.println(sb);
    }

}
