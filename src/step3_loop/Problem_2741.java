package step3_loop;

import java.util.*;
import java.io.*;

public class Problem_2741 {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		for (int i=1; i<=n; ++i)
			sb.append(i).append('\n');
		System.out.println(sb.toString());
	}

}
