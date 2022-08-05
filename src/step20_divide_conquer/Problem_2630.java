package step20_divide_conquer;

import java.util.*;

public class Problem_2630 {
    static int n;
    static int[][] board;
    static int[] cnt = new int[2];
    
    static void f(int y, int x, int k, int color) {
        if (k==1) {
            if (board[y][x]==color)
                cnt[color]++;
            return;
        }
        
        boolean fail = false;
        for (int i=y; i<y+k; ++i)
            for (int j=x; j<x+k; ++j)
                if (board[i][j]!=color)
                    fail=true;
        if (!fail) {
            cnt[color]++;
            return;
        }
        for (int i=0; i<2; ++i)
            for (int j=0; j<2; ++j)
                f(y+k/2*i, x+k/2*j, k/2, color);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        board = new int[n][n];
        for (int i=0; i<n; ++i)
            for (int j=0; j<n; ++j)
                board[i][j] = sc.nextInt();
        
        f(0,0,n, 0);
        f(0,0,n, 1);
        
        System.out.println(cnt[0]);
        System.out.println(cnt[1]);

    }

}
