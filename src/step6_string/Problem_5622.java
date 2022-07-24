package step6_string;

import java.io.*;

public class Problem_5622 {
	
	static int f(char c) {
		int x = c-'A';
		if (x < 15)
			return 3 + x/3;
		if (x < 19)
			return 8;
		if (x < 22)
			return 9;
		return 10;
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] s = br.readLine().toCharArray();
		int ans=0;
		for (char c : s) {
			ans+=f(c);
		}
		System.out.println(ans);
	}

}
