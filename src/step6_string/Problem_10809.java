package step6_string;

import java.io.*;
import java.util.Arrays;

public class Problem_10809 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		char[] s = br.readLine().toCharArray();
		int[] cntArr = new int[26];
		Arrays.fill(cntArr, -1);
		int sz = s.length;
		for (int i=0; i<sz; ++i) {
			int idx = s[i]-'a';
			if (cntArr[idx]==-1) cntArr[idx]=i;
		}
		for (int x: cntArr)
			sb.append(x).append(' ');
		System.out.println(sb);
	}

}
