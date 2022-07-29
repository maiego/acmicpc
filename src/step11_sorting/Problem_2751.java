package step11_sorting;

import java.io.*;
import java.util.Arrays;

public class Problem_2751 {

	static int[] arr = new int[2000011];

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		for (int i=0; i<n; ++i) {
			int x = Integer.parseInt(br.readLine());
			arr[x+1000000]++;
		}
		
		for (int i=0; i<=2000010; ++i) {
			while (arr[i]-->0)
				sb.append(i-1000000).append('\n');
		}
		
		System.out.println(sb);
	}

}
