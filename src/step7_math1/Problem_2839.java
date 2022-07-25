package step7_math1;

import java.util.*;
import java.io.*;

public class Problem_2839 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int ans = 5000;
		for (int i=0; i<=n/5; ++i) {
			int x = n-5*i;
			if (x%3==0) {
				ans = Math.min(ans, i+x/3);
			}
		}
		if (ans==5000) ans=-1;
		System.out.println(ans);
	}

}
