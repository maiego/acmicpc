package step11_sorting;

import java.util.*;
import java.io.*;

public class Problem_10814 {
	static class Item {
		int age;
		String name;
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = null;
		
		int n = Integer.parseInt(br.readLine());
		Item[] arr=  new Item[n];

		for (int i=0; i<n; ++i) {
			st = new StringTokenizer(br.readLine());
			arr[i] = new Item();
			arr[i].age = Integer.parseInt(st.nextToken());
			arr[i].name = st.nextToken();
		}
		
		Arrays.sort(arr, (a,b)->a.age-b.age);

		for (int i=0;i <n; ++i) {
			sb.append(arr[i].age).append(' ').append(arr[i].name).append('\n');
		}
		System.out.println(sb);
	}

}
