package step12_set_and_map;

import java.io.*;
import java.util.*;

public class Problem_1764 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        StringBuilder sb = new StringBuilder();

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int q = Integer.parseInt(st.nextToken());
        
        Set<String> set = new HashSet<>();
        while (n-->0) {
            set.add(br.readLine());
        }
        
        List<String> list = new ArrayList<>();
        while (q-->0) {
            String name = br.readLine();
            if (set.contains(name))
                list.add(name);
        }
        Collections.sort(list);

        sb.append(list.size()).append('\n');
        for (String s: list) {
            sb.append(s).append('\n');
        }
        System.out.println(sb);
    }

}
