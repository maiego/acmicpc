package step16_dp1;

import java.util.*;

public class Problem_9251 {
	static String s1,s2;
	static int[][] cache = new int[1000][1000];
	static {
		for (int i=0; i<1000; ++i)
			Arrays.fill(cache[i], -1);
	}
	
	static int f(int i, int j) {
		if (i==s1.length() || j==s2.length()) return 0;
		if (cache[i][j] != -1) return cache[i][j];
		if (s1.charAt(i) == s2.charAt(j)) {
			return cache[i][j] = 1+f(i+1, j+1);
		}
		return cache[i][j] = Math.max(f(i,j+1), f(i+1,j));
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		System.out.println(f(0,0));
	}

}
