package step3_loop;

import java.util.*;
import java.io.*;

public class Problem_10871 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		while (n-->0) {
			int x = Integer.parseInt(st.nextToken());
			if (x<k) sb.append(x).append(' ');
		}
		
		System.out.println(sb);
	}

}
