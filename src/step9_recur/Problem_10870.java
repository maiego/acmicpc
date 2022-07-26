package step9_recur;

import java.io.*;
import java.util.*;

public class Problem_10870 {
    
    static long fibo(int n) {
        if (n==0) return 0L;
        if (n==1) return 1L;
        return fibo(n-1)+fibo(n-2);
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
//        int a=0, b=1;
//        while (n-->0) {
//            int tmp=a+b;
//            a=b; b=tmp;
//        }
        System.out.println(fibo(n));

    }

}
