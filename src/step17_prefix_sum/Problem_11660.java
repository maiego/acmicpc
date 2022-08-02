package step17_prefix_sum;

import java.io.*;
import java.util.*;

public class Problem_11660 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = null;
        
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int q = Integer.parseInt(st.nextToken());
        int[][] board = new int[n+1][n+1];
        int[][] pref = new int[n+1][n+1];
        for (int i=1; i<=n; ++i) {
            st = new StringTokenizer(br.readLine());
            for (int j=1; j<=n; ++j) {
                board[i][j] = Integer.parseInt(st.nextToken());
                pref[i][j] = board[i][j] + pref[i-1][j] + pref[i][j-1] - pref[i-1][j-1];
            }
        }
        
        while (q-->0) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());
            sb.append(pref[c][d]-pref[a-1][d]-pref[c][b-1]+pref[a-1][b-1]).append('\n');
        }
        System.out.println(sb);

    }

}
