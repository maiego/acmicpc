package step14_number_theory;

import java.io.*;
import java.util.*;

public class Problem_2004 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		int cnt2=0, cnt5=0;
		int x = n;
		while (x>0) {
			cnt2 += x/2;
			x/=2;
		}
		x = n;
		while (x>0) {
			cnt5 += x/5;
			x/=5;
		}
		x = k;
		while (x>0) {
			cnt2 -= x/2;
			x/=2;
		}
		x = k;
		while (x>0) {
			cnt5 -= x/5;
			x/=5;
		}
		x = n-k;
		while (x>0) {
			cnt2 -= x/2;
			x/=2;
		}
		x = n-k;
		while (x>0) {
			cnt5 -= x/5;
			x/=5;
		}
		
		System.out.println(Math.min(cnt2, cnt5));

	}

}
