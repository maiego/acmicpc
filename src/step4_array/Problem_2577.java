package step4_array;

import java.util.*;
import java.io.*;

public class Problem_2577 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		int c = Integer.parseInt(br.readLine());
		
		String s = Integer.toString(a*b*c);
		int[] arr = new int[10];
		for (char digit: s.toCharArray()) {
			arr[digit-'0']++;
		}
		for (int x: arr)
			sb.append(x).append('\n');
		System.out.println(sb);
	}

}
