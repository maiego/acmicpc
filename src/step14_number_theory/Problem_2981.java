package step14_number_theory;

import java.io.*;
import java.util.*;

public class Problem_2981 {
	static int gcd(int a, int b) {
		while (b!=0) {
			int tmp = b;
			b = a%b;
			a = tmp;
		}
		return a;
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		int [] arr = new int[n];
		for (int i=0; i<n; ++i) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(arr);
		int g = arr[1]-arr[0];
		for (int i=2; i<n; ++i) {
			g = gcd(g, arr[i]-arr[i-1]);
		}
		List<Integer> ans = new ArrayList<>();
		for (int i=2; i*i<=g; ++i) {
			if (g%i>0) continue;
			ans.add(i);
			if (i*i!=g) ans.add(g/i);
		}
		ans.add(g);
		Collections.sort(ans);
		for (int x: ans)
			sb.append(x).append(' ');
		System.out.println(sb);

	}

}
