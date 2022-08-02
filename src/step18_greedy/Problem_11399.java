package step18_greedy;

import java.util.*;

public class Problem_11399 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; ++i)
            arr[i] = sc.nextInt();
        Arrays.sort(arr);
        int ans = 0;
        for (int i=0; i<n; ++i) {
           ans += (n-i)*arr[i]; 
        }
        System.out.println(ans);

    }

}
