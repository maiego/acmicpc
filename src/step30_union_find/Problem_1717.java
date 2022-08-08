package step30_union_find;

import java.util.*;

public class Problem_1717 {
	static int n;
	static int[] link;

	static int find(int x) {
		return link[x]==x ? x : (link[x]=find(link[x]));
	}


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		n = sc.nextInt();
		link = new int[n+1];
		for (int i=1; i<=n; ++i)
			link[i] = i;

		int q = sc.nextInt();
		while (q-->0) {
			int type = sc.nextInt();
			int a = sc.nextInt();
			int b = sc.nextInt();
			int x=find(a), y=find(b);
			if (type==0) {
				link[x]=y;
			} else {
				sb.append(x==y ? "YES\n" : "NO\n");
			}
		}
		System.out.println(sb);

	}

}
