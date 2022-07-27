package step10_brute_force;

import java.util.*;
import java.io.*;

public class Problem_2231 {
    static int[] arr;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        arr = new int[n+1];
        
        for (int i=1; i<=n; ++i) {
            int x = i;
            int k = x;
            while (x>0) {
                k += x%10;
                x/=10;
            }
            if (k<=n && arr[k]==0) {
                arr[k] = i;
            }
        }
        System.out.println(arr[n]);
    }

}
