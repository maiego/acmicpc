package step14_number_theory;

import java.util.*;
import java.io.*;

public class Problem_3036 {
	
	static int gcd(int a, int b) { return b==0 ? a : gcd(b,a%b); }

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = null;
		
		int n = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		while (--n>0) {
		    int b = Integer.parseInt(st.nextToken());
		    int g = gcd(a,b);
		    sb.append(a/g).append('/').append(b/g).append('\n');
		}
		
		System.out.println(sb);
	}

}
