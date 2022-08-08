package step30_union_find;

import java.util.*;

public class Problem_20040 {
	static int[] link;
	
	static int find(int x) {
		return x==link[x] ? x : (link[x]=find(link[x]));
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		link = new int[n+1];
		for (int i=1; i<=n; ++i)
			link[i] = i;

		int ans=0;
		for (int i=1; i<=m; ++i) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int x=find(a), y=find(b);
			if (x==y) {
				ans = i;
				break;
			}
			link[x]=y;
		}
		System.out.println(ans);
	}

}
