package step8_math2;

import java.io.*;
import java.util.*;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils.IO;

public class Problem_1978 {
    
    static boolean isPrime(int x) {
        if (x==1) return false;
        for (int i=2; i*i<=x; ++i) {
            if (x%i==0) return false;
        }
        return true;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        int ans = 0;
        int n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        while (n-->0) {
            int x = Integer.parseInt(st.nextToken());
            if (isPrime(x)) ++ans;
        }
        System.out.println(ans);


    }

}
