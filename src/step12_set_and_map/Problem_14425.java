package step12_set_and_map;

import java.io.*;
import java.util.*;

public class Problem_14425 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        int q = Integer.parseInt(st.nextToken());
        
        Set<String> set = new HashSet<>();
        while (n-->0) {
            set.add(br.readLine());
        }
        
        int ans=0;
        while (q-->0) {
            if (set.contains(br.readLine()))
                ++ans;
        }
        System.out.println(ans);
    }

}
