package step3_loop;

import java.io.*;
import java.util.*;

public class Problem_10951 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String line;
		while ((line = br.readLine()) != null) {
			StringTokenizer st = new StringTokenizer(line);
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			sb.append(a+b).append('\n');
		}
		System.out.println(sb);
	}

}


