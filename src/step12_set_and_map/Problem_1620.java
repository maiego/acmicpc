package step12_set_and_map;

import java.io.*;
import java.util.*;

public class Problem_1620 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        StringBuilder sb = new StringBuilder();
        
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int q = Integer.parseInt(st.nextToken());
        
        Map<String, Integer> name2id = new HashMap<>();
        Map<Integer, String> id2name = new HashMap<>();
        for (int i=1; i<=n; ++i) {
            String name = br.readLine();
            name2id.put(name, i);
            id2name.put(i, name);
        }

        while (q-->0) {
            String s = br.readLine();
            if (name2id.get(s)!=null) sb.append(name2id.get(s)).append('\n');
            else sb.append(id2name.get(Integer.parseInt(s))).append('\n');
        }
        System.out.println(sb);
    }

}
