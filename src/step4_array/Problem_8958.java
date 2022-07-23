package step4_array;

import java.io.*;
import java.util.*;

public class Problem_8958 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		for (int i=0; i<n; ++i) {
			int score=0;
			int cnt=0;
			for (char c: br.readLine().toCharArray()) {
				if (c=='O') {
					++cnt;
					score += cnt;
				} else {
					cnt=0;
				}
			}
			sb.append(score).append('\n');
		}
		System.out.println(sb);
	}

}
