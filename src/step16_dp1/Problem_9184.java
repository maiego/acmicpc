package step16_dp1;

import java.util.*;

public class Problem_9184 {
	static int[][][] cache = new int[21][21][21];
	static {
		for (int i=0; i<21; ++i)
		for (int j=0; j<21; ++j)
		for (int k=0; k<21; ++k)
			cache[i][j][k]=-1;
	}
	
	static int f(int a, int b, int c) {
		if (a<=0 || b<=0 || c<=0)
			return 1;
		if (a>20 || b>20 || c>20)
			return f(20,20,20);
		if (cache[a][b][c]!=-1)
			return cache[a][b][c];
		if (a<b && b<c)
			return cache[a][b][c] = f(a,b,c-1) + f(a,b-1,c-1) - f(a,b-1,c);
		return cache[a][b][c] = f(a-1,b,c) + f(a-1,b-1,c) + f(a-1,b,c-1) - f(a-1,b-1,c-1);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		while (true) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			if (a==-1 && b==-1 && c==-1)
				break;
			sb.append(String.format("w(%d, %d, %d) = %d\n", a,b,c,f(a,b,c)));
		}
		System.out.println(sb);

	}

}
