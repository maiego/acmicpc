package step6_string;

import java.io.*;

public class Problem_11720 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();
		int ans = 0;
		for (char c: br.readLine().toCharArray()) {
			ans += c-'0';
		}
		System.out.println(ans);
	}

}
