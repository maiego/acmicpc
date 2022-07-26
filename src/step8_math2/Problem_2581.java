package step8_math2;

import java.io.*;
import java.util.*;

public class Problem_2581 {
    
    static int[] p = new int[10001];
    
    static {
        Arrays.fill(p, 1);
        p[0]=p[1]=0;
        for (int i=2; i<=100; ++i) {
            if (p[i]==1)
                for (int j=i*i; j<=10000; j+=i)
                    p[j]=0;
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        
        int sum=0, minv=10000;
        for (int i=a; i<=b; ++i) {
            if (p[i]==1) {
                sum += i;
                minv = Math.min(minv,  i);
            }
        }
        if (minv==10000)
            System.out.println(-1);
        else
            System.out.println(sum + "\n" + minv);
    }

}
