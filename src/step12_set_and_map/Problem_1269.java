package step12_set_and_map;

import java.io.*;
import java.util.*;

public class Problem_1269 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        Set<Integer> set1 = new HashSet<>();
        st = new StringTokenizer(br.readLine());
        while (n-->0) {
            set1.add(Integer.parseInt(st.nextToken()));
        }
        
        Set<Integer> set2 = new HashSet<>();
        Set<Integer> common = new HashSet<>();
        st = new StringTokenizer(br.readLine());
        while (m-->0) {
            int x = Integer.parseInt(st.nextToken());
            if (set1.contains(x)) {
                common.add(x);
            }
            set2.add(x);
        }

        System.out.println(set1.size()+set2.size()-common.size()*2);
    }

}
