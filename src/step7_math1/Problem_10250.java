package step7_math1;

import java.io.*;
import java.util.*;

public class Problem_10250 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = null;
		int T = Integer.parseInt(br.readLine());
		while (T-->0) {
			st = new StringTokenizer(br.readLine());
			int h = Integer.parseInt(st.nextToken());
			int w = Integer.parseInt(st.nextToken());
			int n = Integer.parseInt(st.nextToken());
			sb.append(String.format("%d%02d\n", (n-1)%h +1, (n-1)/h +1));
		}
		System.out.println(sb);
	}

}
