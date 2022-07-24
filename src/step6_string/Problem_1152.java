package step6_string;

import java.io.*;
import java.util.*;

public class Problem_1152 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int cnt=0;
		String line = br.readLine().trim();
		if (line.isEmpty())
			System.out.println(0);
		else
			System.out.println(line.split(" ").length);
	}

}
