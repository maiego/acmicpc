package step17_prefix_sum;

import java.util.*;

public class Problem_11659 {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int q = sc.nextInt();
        
        int[] arr = new int[n+1];
        int[] pref = new int[n+1];
        for (int i=1; i<=n; ++i) {
            arr[i] = sc.nextInt();
            pref[i] = arr[i] + pref[i-1];
        }
        
        while (q-->0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(pref[b]-pref[a-1]);
        }
    }

}
