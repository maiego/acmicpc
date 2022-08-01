package step16_dp1;

import java.util.*;
import java.io.*;

public class Problem_1932 {
	static int[][] cache = new int[501][501];
	static int n;
	static int[][] board;
	
	static int f(int y, int x) {
		if (y==n) return 0;
		if (cache[y][x]!=-1) return cache[y][x];
		return cache[y][x] = board[y][x] + Math.max(f(y+1,x), f(y+1,x+1));
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		
		n = Integer.parseInt(br.readLine());
		board = new int[n][n];
		for (int i=0; i<n; ++i)
			Arrays.fill(cache[i], -1);
		for (int i=0; i<n; ++i) {
			st = new StringTokenizer(br.readLine());
			for (int j=0; j<i+1; ++j) {
				board[i][j] = Integer.parseInt(st.nextToken());
			}
		}

//		for (int i=0; i<n; ++i) {
//			for (int j=0; j<n; ++j) {
//				System.out.print(f[i][j] + " ");
//			}
//			System.out.println();
//		}
		System.out.println(f(0,0));

	}

}
