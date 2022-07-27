package step10_brute_force;

import java.util.*;
import java.io.*;

public class Problem_2798 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i=0; i<n; ++i)
            arr[i] = Integer.parseInt(st.nextToken());
        
        int maxSum = 0;

        for (int i=0; i<n; ++i) {
            for (int j=i+1; j<n; ++j) {
                int sum2 = arr[i]+arr[j];
                for (int k=j+1; k<n; ++k) {
                    int sum = sum2+arr[k];
                    if (arr[i]+arr[j]+arr[k]<=m) {
                        maxSum = Math.max(maxSum, sum);
                    }
                }
            }
        }
        System.out.println(maxSum);
        
    }

}
