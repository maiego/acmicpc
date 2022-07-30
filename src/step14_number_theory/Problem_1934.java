package step14_number_theory;

import java.io.*;
import java.util.*;

public class Problem_1934 {
	static int gcd(int a, int b) { return b==0 ? a : gcd(b, a%b); }

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = null;

		int T = Integer.parseInt(br.readLine());
		while (T-->0) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int g = gcd(a,b);
			sb.append(a/g*b).append('\n');
		}
		System.out.println(sb);
	}

}
