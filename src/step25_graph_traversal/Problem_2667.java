package step25_graph_traversal;

import java.util.*;

public class Problem_2667 {
    static int n;
    static char[][] board;
    
    final static int[] dy = {-1,1,0,0};
    final static int[] dx = {0,0,-1,1};
    
    static boolean inRange(int y, int x) {
        return y>=0 && x>=0 && y<n && x<n;
    }
    
    static int dfs(int y, int x) {
        if (y>=n || x>=n || y<0 || x<0 || board[y][x]=='0')
            return 0;

        board[y][x]='0';
        return 1+dfs(y-1,x)+dfs(y+1,x)+dfs(y,x-1)+dfs(y,x+1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        n = sc.nextInt();
        board = new char[n][];
        for (int i=0; i<n; ++i)
            board[i] = sc.next().toCharArray();
        
        
        List<Integer> ans = new ArrayList<>();
        for (int i=0; i<n; ++i)
            for (int j=0; j<n; ++j)
                if (board[i][j]=='1')
                    ans.add(dfs(i, j));
        
        Collections.sort(ans);
        System.out.println(ans.size());
        for (int x: ans)
            System.out.println(x);

    }

}
