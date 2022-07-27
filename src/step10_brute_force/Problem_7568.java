package step10_brute_force;

import java.util.*;
import java.io.*;

class Item {
    int a,b;
}

public class Problem_7568 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = null;
        int n = Integer.parseInt(br.readLine());
        Item[] arr = new Item[n];
        
        for (int i=0; i<n; ++i) {
            st = new StringTokenizer(br.readLine());
            arr[i] = new Item();
            arr[i].a = Integer.parseInt(st.nextToken());
            arr[i].b = Integer.parseInt(st.nextToken());
        }
        
        for (int i=0; i<n; ++i) {
            int rank=1;
            for (int j=0; j<n; ++j) {
                if (arr[i].a<arr[j].a && arr[i].b<arr[j].b)
                    ++rank;
            }
            sb.append(rank).append(' ');
        }

        System.out.println(sb);

    }

}
