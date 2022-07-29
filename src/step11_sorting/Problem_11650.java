package step11_sorting;

import java.util.*;
import java.io.*;

public class Problem_11650 {
	static class Item {
		int x,y;
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = null;
		
		int n = Integer.parseInt(br.readLine());
		Item[] arr = new Item[n];
		for (int i=0; i<n; ++i) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			arr[i] = new Item();
			arr[i].x = a; arr[i].y = b;
		}
		
		Arrays.sort(arr, (a,b)->{
			if (a.x==b.x) return a.y-b.y;
			return a.x-b.x;
		});
		
		for (int i=0; i<n; ++i) {
			sb.append(arr[i].x).append(' ').append(arr[i].y).append('\n');
		}
		System.out.println(sb);

	}

}
