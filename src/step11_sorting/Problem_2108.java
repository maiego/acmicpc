package step10_sorting;

import java.io.*;
import java.util.*;

public class Problem_2108 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		long sum = 0;
		Map<Integer, Integer> freq = new HashMap<>();

		int maxFreq = 0;
		for (int i=0; i<n; ++i) {
			arr[i] = Integer.parseInt(br.readLine());
			sum += arr[i];
			int x = freq.getOrDefault(arr[i], 0)+1;
			freq.put(arr[i], x);
			if (maxFreq < x) maxFreq=x;
		}
		
		List<Integer> list = new ArrayList<>();
		for (Map.Entry<Integer, Integer> e: freq.entrySet()) {
			if (e.getValue() == maxFreq) {
				list.add(e.getKey());
			}
		}

		Collections.sort(list);
		int mostFreqValue = (list.size() > 1 ? list.get(1) : list.get(0));
		
		Arrays.sort(arr);

		sb.append((int)Math.round(1.0*sum/n)).append('\n');
		sb.append(arr[n/2]).append('\n');
		sb.append(mostFreqValue).append('\n');
		sb.append(arr[n-1]-arr[0]).append('\n');
		
		System.out.println(sb);

	}

}
