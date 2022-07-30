package step14_number_theory;

import java.io.*;
import java.util.*;

public class Problem_2609 {
	
	static int gcd(int a, int b) { return b==0 ? a : gcd(b,a%b); }

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int g = gcd(a,b);
		sb.append(g).append('\n').append(a/g*b);
		System.out.println(sb);
	}

}
