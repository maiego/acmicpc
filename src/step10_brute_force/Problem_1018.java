package step10_brute_force;

import java.io.*;
import java.util.*;

public class Problem_1018 {
    static int h,w;
    static char[][] board;
    
    static int f(int y, int x) {
        int ret = 0;
        for (int i=0; i<8; ++i) {
            for (int j=0; j<8; ++j) {
                if ((i+j)%2==0) {
                    ret += (board[y+i][x+j]=='W' ? 1 : 0);
                } else {
                    ret += (board[y+i][x+j]=='B' ? 1 : 0);
                }
            }
        }
        return Math.min(ret,  64-ret);
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        h = Integer.parseInt(st.nextToken());
        w = Integer.parseInt(st.nextToken());
        
        board = new char[h][];
        for (int i=0; i<h; ++i) {
            board[i] = br.readLine().toCharArray();
        }
        
        int ans = (int)1e9;
        for (int i=0; i<=h-8; ++i)
            for (int j=0; j<=w-8; ++j)
                ans = Math.min(ans, f(i,j));
        System.out.println(ans);
    }
}