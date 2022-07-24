package step6_string;

import java.io.*;

public class Problem_2941 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		
		String[] arr = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
		for (String s: arr) {
			line = line.replaceAll(s, "1");
		}
		System.out.println(line.length());
	}

}
