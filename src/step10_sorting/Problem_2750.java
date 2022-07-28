package step10_sorting;

import java.io.*;
import java.util.Arrays;

public class Problem_2750 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		for (int i=0; i<n; ++i) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(arr);
		
		for (int i=0; i<n; ++i) {
			sb.append(arr[i]).append('\n');
		}
		System.out.println(sb);

	}

}
