package step17_prefix_sum;

import java.util.*;

public class Problem_2559 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n+1];
        int[] pref = new int[n+1];
        for (int i=1; i<=n; ++i) {
            arr[i] = sc.nextInt();
            pref[i] = arr[i] + pref[i-1];
        }
        int ans = -(int)1e9;
        for (int i=k; i<=n; ++i)
            ans = Math.max(ans, pref[i]-pref[i-k]);
        System.out.println(ans);

    }

}
