package step31_mst;

import java.util.*;

public class Problem_4386 {
	static int n;
	static int[] link;
	static double[] x,y;
	
	static class Edge {
		int u,v;
		double dist;
	}
	
	static int find(int x) {
		return x==link[x] ? x : (link[x]=find(link[x]));
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		link = new int[n+1];
		x = new double[n];
		y = new double[n];
		for (int i=1; i<=n; ++i)
			link[i] = i;
		
		for (int i=0; i<n; ++i) {
			x[i] = sc.nextDouble();
			y[i] = sc.nextDouble();
		}
		
		List<Edge> edges = new ArrayList<>();
		for (int i=0; i<n; ++i) {
			for (int j=i+1; j<n; ++j) {
				Edge e = new Edge();
				e.u=i; e.v=j;
				e.dist = Math.hypot(x[i]-x[j], y[i]-y[j]);
				edges.add(e);
			}
		}
		edges.sort((a,b) -> (a.dist<b.dist ? -1 : 1));
		
		double ans=0;
		for (Edge e : edges) {
			int x=find(e.u), y=find(e.v);
			if (x==y) continue;
			link[x]=y;
			ans += e.dist;
		}
		System.out.printf("%.2f\n", ans);
	}

}
