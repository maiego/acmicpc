package step5_function;

import java.util.*;
import java.io.*;

public class Problem_1065 {
	
	static boolean check(int x) {
		if (x<10) return true;
		char[] s = Integer.toString(x).toCharArray(); 
		int sz = s.length;
		int diff = s[1]-s[0];
		for (int i=1; i<sz; ++i) {
			if (s[i]-s[i-1] != diff)
				return false;
		}
		return true;
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int cnt=0;
		for (int i=1; i<=n; ++i)
			if (check(i)) ++cnt;
		System.out.println(cnt);
	}

}
