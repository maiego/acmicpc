package step30_union_find;

import java.util.*;

public class Problem_1976 {
	static int n, m;
	static int[] link;
	
	static int find(int x) {
		return x==link[x] ? x : (link[x]=find(link[x]));
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		link = new int[n+1];
		for (int i=1; i<=n;++i)
			link[i] = i;

		m = sc.nextInt();
		for (int i=1; i<=n; ++i) {
			int x = find(i);
			for (int j=1; j<=n; ++j) {
				if (sc.nextInt()==1) {
					int y = find(j);
					link[y]=x;
				}
			}
		}
		int[] city = new int[m];
		for (int i=0; i<m; ++i) {
			city[i] = sc.nextInt();
		}
		boolean ans = true;
		for (int i=0; i<m-1; ++i)
			ans &= find(city[i])==find(city[i+1]);
		System.out.println(ans ? "YES" : "NO");
	}

}
