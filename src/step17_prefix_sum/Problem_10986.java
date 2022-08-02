package step17_prefix_sum;

import java.io.*;
import java.util.*;

public class Problem_10986 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int mod = Integer.parseInt(st.nextToken());

        int[] arr = new int[n+1];
        int[] pref = new int[n+1];
        st = new StringTokenizer(br.readLine());
        for (int i=1; i<=n; ++i) {
            arr[i] = Integer.parseInt(st.nextToken());
            pref[i] = (arr[i] + pref[i-1])%mod;
        }
        
        Map<Integer, Integer> m = new HashMap<>();
        for (int i=1; i<=n; ++i) {
            m.put(pref[i], 1+m.getOrDefault(pref[i], 0));
        }
        
        long ans=m.getOrDefault(0,0);
        for (int k : m.keySet()) {
            long v = m.get(k);
            ans += v*(v-1)/2;
        }
        System.out.println(ans);
    }

}
