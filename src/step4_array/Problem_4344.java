package step4_array;

import java.util.*;
import java.io.*;

public class Problem_4344 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());
		for (int i=0; i<T; ++i) {
			st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int sum=0;
			int[] arr = new int[n];
			for (int j=0; j<n; ++j) {
				arr[j] = Integer.parseInt(st.nextToken());
				sum += arr[j];
			}

			int cnt=0;
			double avg = 1.0*sum/n;
			for (int j=0; j<n; ++j) {
				if (arr[j]>avg) ++cnt;
			}
			sb.append(String.format("%.3f", 1.0*cnt/n*100)).append("%\n");
		}
		System.out.println(sb);
	}
}
