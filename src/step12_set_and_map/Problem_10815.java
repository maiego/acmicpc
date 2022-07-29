package step12_set_and_map;

import java.util.*;
import java.io.*;

public class Problem_10815 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = null;
        
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        Set<Integer> set = new HashSet<>();
        st = new StringTokenizer(br.readLine());
        for (int i=0; i<n; ++i) {
            arr[i] = Integer.parseInt(st.nextToken());
            set.add(arr[i]);
        }
        
        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int i=0; i<m; ++i) {
            int x = Integer.parseInt(st.nextToken());
            if (set.contains(x)) sb.append(1).append(' ');
            else sb.append(0).append(' ');
        }

        System.out.println(sb);
    }

}
