package step3_loop;

import java.io.*;
import java.util.*;

public class Problem_11022 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		for (int i=1; i<=T; ++i) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			sb.append("Case #").append(i).append(": ")
			.append(a).append(" + ").append(b).append(" = ").append(a+b).append('\n');
		}
		System.out.println(sb);
	}

}
