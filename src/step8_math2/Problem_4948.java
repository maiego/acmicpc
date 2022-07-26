package step8_math2;

import java.io.*;
import java.util.*;

public class Problem_4948 {
    static int[] p = new int[1000001];
    static {
        Arrays.fill(p, 1);
        p[0]=p[1]=0;
        for (int i=2; i<=1000; ++i)
            if (p[i]==1)
                for (int j=i*i; j<=1000000; j+=i)
                    p[j]=0;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while (true) {
            int n = Integer.parseInt(br.readLine());
            if (n==0) break;
            int cnt=0;
            for (int i=n+1; i<=2*n; ++i)
                if (p[i]==1) ++cnt;
            sb.append(cnt).append('\n');
        }
        System.out.println(sb);

    }

}
