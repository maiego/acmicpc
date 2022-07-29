package step12_set_and_map;

import java.io.*;
import java.util.*;

public class Problem_10816 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = null;
        
        Map<Integer,Integer> map = new HashMap<>();

        int n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        while (n-->0) {
            int x = Integer.parseInt(st.nextToken());
            map.put(x, map.getOrDefault(x, 0)+1);
        }

        int q = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        while (q-->0) {
            int x = Integer.parseInt(st.nextToken());
            sb.append(map.getOrDefault(x,0)).append(' ');
        }
        System.out.println(sb);
    }

}
