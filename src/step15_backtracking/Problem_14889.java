package step15_backtracking;

import java.io.*;
import java.util.*;

public class Problem_14889 {
	static int n;
	static int[][] board;
	
	static int f(int x) {
		int ret = 0;
		for (int i=0; i<n; ++i)
		for (int j=0; j<n; ++j)
			if ((x&(1<<i))>0 && (x&(1<<j))>0)
				ret += board[i][j];
        return ret;
	}
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		n = Integer.parseInt(br.readLine());
		board = new int[n][n];
		for (int i=0; i<n; ++i) {
			st = new StringTokenizer(br.readLine());
		    for (int j=0; j<n; ++j)
			    board[i][j] = Integer.parseInt(st.nextToken());
		}
		
		int ans = (int)1e9;
		for (int i=0; i<(1<<n); ++i) {
			if (Integer.bitCount(i) == n/2) {
				ans = Math.min(ans, Math.abs(f(i) - f(~i)));
			}
		}
		
		
		
		System.out.println(ans);
	}
}
