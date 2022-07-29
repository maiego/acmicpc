package step11_sorting;

import java.io.*;
import java.util.*;

public class Problem_1181 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		String[] arr = new String[n];
		for (int i=0; i<n; ++i) {
			arr[i] = br.readLine();
		}
		Arrays.sort(arr, (a,b)->{
			if (a.length() == b.length()) return a.compareTo(b);
			return a.length()-b.length();
		});
		String prev = null;
		for (String s: arr) {
			if (prev!=null && prev.equals(s)) continue;
			sb.append(s).append('\n');
			prev = s;
		}
		System.out.println(sb);
	}

}
