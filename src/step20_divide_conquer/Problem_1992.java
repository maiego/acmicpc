package step20_divide_conquer;

import java.util.*;

public class Problem_1992 {
    static int n;
    static char[][] board;
    static StringBuilder sb = new StringBuilder();

    static void f(int y, int x, int k) {
        int cnt0 = 0, cnt1 = 0;
        for (int i = y; i < y + k; ++i)
            for (int j = x; j < x + k; ++j) {
                if (board[i][j] == '1')
                    ++cnt1;
                else
                    ++cnt0;
            }
        if (cnt0 == k * k)
            sb.append(0);
        else if (cnt1 == k * k)
            sb.append(1);
        else {
            sb.append('(');
            for (int i=0; i<2; ++i)
                for (int j=0; j<2; ++j)
                    f(y+k/2*i, x+k/2*j, k/2);
            sb.append(')');
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        board = new char[n][];
        for (int i = 0; i < n; ++i) {
            board[i] = sc.next().toCharArray();
        }

        f(0, 0, n);
        System.out.println(sb);
    }

}
