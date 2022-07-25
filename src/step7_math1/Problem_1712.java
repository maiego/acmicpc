package step7_math1;

import java.io.*;
import java.util.*;

public class Problem_1712 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		
		int ans=-1;
		if (c-b<=0) ans= -1;
		else ans = 1 + a/(c-b);
		System.out.println(ans);

	}

}
