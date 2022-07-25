package step7_math1;

import java.util.*;
import java.io.*;

public class Problem_2775 {
	static int n = 15;
	static int[][] ans = new int[15][15];
	
	static {
		for (int i=0; i<n; ++i)
			ans[0][i]=i;
		for (int i=1; i<n; ++i) {
			for (int j=1; j<n; ++j) {
				ans[i][j] = ans[i][j-1] + ans[i-1][j];
			}
		}
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		while (T-->0) {
			int a = Integer.parseInt(br.readLine());
			int b = Integer.parseInt(br.readLine());
			sb.append(ans[a][b]).append('\n');
		}
		System.out.println(sb);
	}

}
