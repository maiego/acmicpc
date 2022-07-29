package step12_set_and_map;

import java.io.*;
import java.util.*;

public class Problem_11478 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        Set<String> set = new HashSet<>();
        int sz = s.length();
        for (int i=0; i<sz; ++i) {
            for (int j=i+1; j<=sz; ++j) {
                set.add(s.substring(i,j));
            }
        }
        System.out.println(set.size());
    }

}
