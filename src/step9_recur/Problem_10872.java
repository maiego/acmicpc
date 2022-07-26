package step9_recur;

import java.util.*;
import java.io.*;

public class Problem_10872 {

    static int f(int n) {
        if (n==0) return 1;
        return n*f(n-1);
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
//        long ans=1;
//        for (int i=2; i<=n; ++i)
//            ans*=i;
        System.out.println(f(n));

    }

}
