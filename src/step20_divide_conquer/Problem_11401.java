package step20_divide_conquer;

import java.util.*;

public class Problem_11401 {
    final static int mod = (int)1e9+7;
    static int[] f = new int[4_000_001];
    static {
        f[0] = 1;
        for (int i=1; i<=4_000_000; ++i)
            f[i] = mul(i, f[i-1]);
    }
    
    static int mul(int a, int b) {
        return (int)((long)a*b%mod);
    }
    
    static int p(int a, int b) {
        if (b==0) return 1;
        int ret = p(a, b/2);
        ret = mul(ret, ret);
        if (b%2==0) return ret;
        return mul(ret, a);
    }
    
    static int C(int n, int k) {
        int ret = f[n];
        ret = mul(ret, p(f[k], mod-2));
        ret = mul(ret, p(f[n-k], mod-2));
        return ret;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(C(n,k));
    }

}
