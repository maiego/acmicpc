package step4_array;

import java.io.*;
import java.util.*;

public class Problem_1546 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		int maxv = 1;
		int sum = 0;
		for (int i=0; i<n; ++i) {
			arr[i] = Integer.parseInt(st.nextToken());
			if (maxv < arr[i]) maxv = arr[i];
			sum += arr[i];
		}
		
		System.out.println(1.0*sum/maxv/n * 100);

	}

}
