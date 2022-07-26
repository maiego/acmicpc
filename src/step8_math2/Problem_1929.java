package step8_math2;

import java.io.*;
import java.util.*;

public class Problem_1929 {
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
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        
        for (int i=a; i<=b; ++i)
            if (p[i]==1) sb.append(i).append('\n');
        System.out.println(sb);
    }

}
