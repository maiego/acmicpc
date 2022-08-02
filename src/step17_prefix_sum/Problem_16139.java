package step17_prefix_sum;

import java.io.*;
import java.util.*;

public class Problem_16139 {
    static int[][] cnt = new int[26][200010];

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = null;

        char[] s = br.readLine().toCharArray();
        int sz = s.length;
        for (int i=1; i<=sz; ++i) {
            for (int idx=0; idx<26; ++idx)
                cnt[idx][i] = cnt[idx][i-1];
            int idx = s[i-1]-'a';
            cnt[idx][i]++;
        }
        int q = Integer.parseInt(br.readLine());
        while (q-->0) {
            st = new StringTokenizer(br.readLine());
            int idx = st.nextToken().charAt(0) - 'a';
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            sb.append(cnt[idx][b+1]-cnt[idx][a]).append('\n');
        }
        System.out.println(sb);

    }

}
