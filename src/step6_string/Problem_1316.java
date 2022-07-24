package step6_string;

import java.io.*;

public class Problem_1316 {
	
	static boolean check(String word) {
		char[] s = word.toCharArray();
		int sz = s.length;
		for (int i=0; i<sz; ++i) {
			boolean flag=true;
			for (int j=i+1; j<sz; ++j) {
				if (s[i]!=s[j] && flag)
					flag = false;
				if (s[i]==s[j] && !flag)
					return false;
			}
		}
		return true;
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int ans=0;
		while (n-->0) {
			if (check(br.readLine())) ++ans;
		}
		System.out.println(ans);
	}

}
