package step25_graph_traversal;

import java.util.*;

public class Problem_1012 {
    static int h, w;
    static int[][] board;
    
    static void dfs(int y, int x) {
        if (y>=h || x>=w || y<0 || x<0 || board[y][x]==0)
            return;
        board[y][x]=0;
        dfs(y-1,x);
        dfs(y+1,x);
        dfs(y,x-1);
        dfs(y,x+1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        
        int T = sc.nextInt();
        while (T-->0) {
            h = sc.nextInt();
            w = sc.nextInt();
            board = new int[h][w];
            int q = sc.nextInt();
            while (q-->0) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                board[a][b] = 1;
            }
            
            int ans = 0;
            for (int i=0; i<h; ++i)
                for (int j=0; j<w; ++j) 
                    if (board[i][j]==1) {
                        dfs(i, j);
                        ++ans;
                    }
            sb.append(ans).append('\n');
        }
        System.out.println(sb);

    }

}
