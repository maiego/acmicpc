package step4_array;

import java.util.*;
import java.io.*;

public class Problem_2562 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[9];
		int maxIdx=0;
		StringTokenizer st;
		for (int i=0; i<9; ++i) {
			st = new StringTokenizer(br.readLine());
			arr[i] = Integer.parseInt(st.nextToken());
			if (arr[i] > arr[maxIdx]) {
				maxIdx = i;
			}
		}
		System.out.println(arr[maxIdx]+"\n"+(1+maxIdx));
		
	}

}
