package step7_math1;

import java.io.*;
import java.util.*;

public class Problem_2292 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		int lo=0, hi=19000;
		while (lo+1 < hi) {
			int mid = (lo+hi)/2;
			if (n<=3*mid*(mid-1)+1) hi=mid;
			else lo=mid;
		}
		System.out.println(hi);
	}

}
