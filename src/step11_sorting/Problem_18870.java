package step10_sorting;

import java.io.*;
import java.util.*;

public class Problem_18870 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = null;
		
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		int[] sorted = new int[n];
		st = new StringTokenizer(br.readLine());
		for (int i=0; i<n; ++i) {
			arr[i] = Integer.parseInt(st.nextToken());
			sorted[i] = arr[i];
		}
		
		Arrays.sort(sorted);
		Map<Integer, Integer> v2idx = new HashMap<>();
		int idx=0;
		for (int i=0; i<n; ++i) {
			if (v2idx.containsKey(sorted[i])) continue;
			v2idx.put(sorted[i], idx++);
		}

		for (int i=0; i<n; ++i) {
			sb.append(v2idx.get(arr[i])).append(' ');
		}

		System.out.println(sb);
	}

}
