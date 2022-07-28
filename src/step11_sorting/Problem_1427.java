package step10_sorting;

import java.io.*;
import java.util.*;

public class Problem_1427 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		char[] s = br.readLine().toCharArray();

		Arrays.sort(s);
		for (int i=s.length-1; i>=0; --i)
			sb.append(s[i]);

		System.out.println(sb);
	}

}
