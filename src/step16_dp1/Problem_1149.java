package step16_dp1;

import java.io.*;
import java.util.*;

public class Problem_1149 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = null;
		
		int n = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		int r = Integer.parseInt(st.nextToken());
		int g = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		for (int i=1; i<n; ++i) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			int z = Integer.parseInt(st.nextToken());
			int rr = Math.min(g,b)+x;
			int gg = Math.min(r,b)+y;
			int bb = Math.min(r,g)+z;
			r=rr; g=gg; b=bb;
		}
		
		System.out.println(Math.min(Math.min(r,g), b));

	}

}
