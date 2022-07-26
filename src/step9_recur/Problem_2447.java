package step9_recur;

import java.io.*;
import java.util.*;

public class Problem_2447 {
    static char[][] board;
    static StringBuilder sb = new StringBuilder();
    
    static boolean check(int y, int x) {
        while (y>0 && x>0) {
            if (y%3==1 && x%3==1) return true;
            y/=3; x/=3;
        }
        return false;
    }
    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        board = new char[n][n];
        for (int i=0; i<n; ++i)
        for (int j=0; j<n; ++j)
            if (check(i,j)) board[i][j]=' ';
            else board[i][j]='*';
        
        for (int i=0; i<n; ++i) {
        for (int j=0; j<n; ++j)
            sb.append(board[i][j]);
        sb.append('\n');
        System.out.println(sb);
        }
    }

}
