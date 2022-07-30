package step14_number_theory;

import java.io.*;
import java.util.*;

public class Problem_5086 {
	
	static int m,n,g;
	
	//am+bn=g
	static void euc(int a, int b) {
		if (b==0) {
			m=1; n=0; g=a;
			return;
		}
		euc(b, a%b);
		int x=m, y=n;
		m = y;
		n = x - (a/b)*y;
	}

	public static void main(String[] args) throws Exception {
		StringBuilder sb = new StringBuilder();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		
		while (true) {
		    st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			if (a==0 && b==0) break;
			euc(a,b);
			if (a==g) sb.append("factor\n");
			else if (b==g) sb.append("multiple\n");
			else sb.append("neither\n");
		}
		System.out.println(sb);
	}

}
