package step20_divide_conquer;

import java.util.*;

public class Problem_1780 {
    
    static int n;
    static int[][] board;
    static int[] cnt = new int[3];
    
    static void f(int y, int x, int k, int color) {
        if (k==1) {
            if (board[y][x]==color)
                ++cnt[color];
            return;
        }
        
        boolean fail=false;
        for (int i=y; i<y+k; ++i)
        for (int j=x; j<x+k; ++j)
            if (board[i][j]!=color)
                fail=true;
        
        if (!fail) {
            ++cnt[color];
            return;
        }
        
        for (int i=0; i<3; ++i)
            for (int j=0; j<3; ++j)
                f(y+k/3*i, x+k/3*j, k/3, color);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        board = new int[n][n];
        
        for (int i=0; i<n; ++i) {
            for (int j=0; j<n; ++j)
                board[i][j] = sc.nextInt()+1;
        }
        
        f(0,0,n, 0);
        f(0,0,n, 1);
        f(0,0,n, 2);
        System.out.println(cnt[0]);
        System.out.println(cnt[1]);
        System.out.println(cnt[2]);

    }

}
