package step8_math2;

import java.io.*;
import java.util.*;

public class Problem_11653 {
    static int[] p = new int[10000];
    
    static {
        Arrays.fill(p, 1);
        p[0]=p[1]=0;
        for (int i=2; i<100; ++i) {
            if (p[i]==1) {
                for (int j=i*i; j<10000; j+=i)
                    p[j]=0;
            }
        }
    }
    
    static boolean isPrime(int x) {
        for (int i=2; i*i<=x; ++i)
            if (p[i]==1 && x%i==0) return false;
        return true;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int x = n;
        for (int i=2; i<=n; ++i) {
            if (isPrime(i)) {
                while (x%i==0) {
                    sb.append(i).append('\n');
                    x/=i;
                }
            }
        }
        System.out.println(sb);
        
    }

}
