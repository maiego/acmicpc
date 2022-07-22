package step3_loop;

import java.util.*;
import java.io.*;

public class Problem_1110 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int x = Integer.parseInt(br.readLine());
		
		int cnt=0;
		int prev = x%10;
		int n=x;
		while (true) {
			int now = n/10 + n%10;
			n = 10*prev + now%10;
			prev = now%10;
			++cnt;
			if (n==x) break;
		}
		System.out.println(cnt);
	}

}
