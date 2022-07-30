package step14_number_theory;

import java.io.*;
import java.util.*;

public class Problem_1010 {
	static int[][] cache = new int[30][30];
	static {
		for (int i=0; i<30; ++i)
			Arrays.fill(cache[i], -1);
	}
	
	static int f(int a, int b) {
		if (b==0 || b==a) return 1;
		if (b==1) return a;
		if (cache[a][b]!=-1) return cache[a][b];
		int ret = f(a-1,b-1) + f(a-1,b);
		return cache[a][b] = ret;
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = null;
		int T = Integer.parseInt(br.readLine());
		while (T-->0) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			sb.append(f(b,a)).append('\n');
		}
		System.out.println(sb);
	}

}
