package step20_divide_conquer;

import java.util.*;

public class Problem_1629 {
    static long a,b,c;
    
    static long mul(long a, long b) {
        return a*b%c;
    }
    
    static long pow(long a, long b) {
        if (b==0) return 1;
        long ret = pow(a, b/2);
        ret = mul(ret,ret);
        if (b%2==1)
            return mul(ret,a);
        return ret;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        a = sc.nextLong();
        b = sc.nextLong();
        c = sc.nextLong();

        System.out.println(pow(a,b));
    }

}
