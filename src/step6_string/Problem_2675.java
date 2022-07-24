package step6_string;

import java.io.*;
import java.util.*;

public class Problem_2675 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		while (T-->0) {
			st = new StringTokenizer(br.readLine());
			int n=Integer.parseInt(st.nextToken());
			char[] s = st.nextToken().toCharArray();
			for (char c: s) {
				for (int i=0; i<n; ++i)
					sb.append(c);
			}
			sb.append('\n');
		}
		System.out.println(sb);

	}

}
