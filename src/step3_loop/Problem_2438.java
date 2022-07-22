package step3_loop;

import java.util.*;
import java.io.*;

public class Problem_2438 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		for (int i=1; i<=n; ++i) {
			int cnt=i;
			while (cnt-->0) {
				sb.append('*');
			}
			sb.append('\n');
		}
		System.out.println(sb);
	}

}
