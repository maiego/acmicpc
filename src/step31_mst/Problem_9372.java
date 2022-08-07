package step31_mst;

import java.util.*;

public class Problem_9372 {
	static int n,e;
	static int[] link;

	static int find(int x) {
		return x==link[x] ? x : (link[x]=find(link[x]));
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while (T-->0) {
			n = sc.nextInt();
			link = new int[n+1];
			for (int i=1; i<=n; ++i)
				link[i] = i;

			int ans=0;
			e = sc.nextInt();
			while (e-->0) {
				int u = sc.nextInt();
				int v = sc.nextInt();
				int x=find(u), y=find(v);
				if (x==y) continue;
				link[x]=y;
				++ans;
			}
			System.out.println(ans);
		}
		
	}

}
