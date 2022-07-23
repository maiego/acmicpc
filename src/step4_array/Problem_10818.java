package step4_array;

import java.util.*;
import java.io.*;

public class Problem_10818 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());

		int minv=(int)1e9;
		int maxv=-(int)1e9;
		for (int i=0; i<n; ++i) {
			int x = Integer.parseInt(st.nextToken());
			if (x<minv) minv=x;
			if (x>maxv) maxv=x;
		}
		

		System.out.println(minv + " " + maxv);
	}

}
