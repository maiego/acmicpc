package step31_mst;

import java.util.*;

public class Problem_2887 {
	static int[] link;
	static Pair[] x,y,z;
	
	static int find(int x) {
		return x==link[x] ? x : (link[x]=find(link[x]));
	}
	
	static class Pair {
		int x,y;
		Pair(int a, int b) {
			x=a; y=b;
		}
	}
	
	static class Edge {
		int u,v, dist;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		x = new Pair[n+1];
		y = new Pair[n+1];
		z = new Pair[n+1];
		link = new int[n+1];
		for (int i=1; i<=n; ++i)
			link[i] = i;
		
		x[0] = new Pair((int)-1e9, 0);
		y[0] = new Pair((int)-1e9, 0);
		z[0] = new Pair((int)-1e9, 0);
		for (int i=1; i<=n; ++i) {
			x[i] = new Pair(sc.nextInt(), i);
			y[i] = new Pair(sc.nextInt(), i);
			z[i] = new Pair(sc.nextInt(), i);
		}
		Arrays.sort(x, (a,b)->a.x-b.x);
		Arrays.sort(y, (a,b)->a.x-b.x);
		Arrays.sort(z, (a,b)->a.x-b.x);
		
		List<Edge> edges = new ArrayList<>();
		for (int i=1; i<n; ++i) {
			Edge e = new Edge();
			e.dist = x[i+1].x-x[i].x;
			e.u=x[i+1].y; e.v=x[i].y;
			edges.add(e);
		}
		for (int i=1; i<n; ++i) {
			Edge e = new Edge();
			e.dist = y[i+1].x-y[i].x;
			e.u=y[i+1].y; e.v=y[i].y;
			edges.add(e);
		}
		for (int i=1; i<n; ++i) {
			Edge e = new Edge();
			e.dist = z[i+1].x-z[i].x;
			e.u=z[i+1].y; e.v=z[i].y;
			edges.add(e);
		}
		
		edges.sort((a,b)-> a.dist-b.dist);
		
		long ans=0;
		int cnt=0;
		for (Edge e: edges) {
			int x=find(e.u), y=find(e.v);
			if (x==y) continue;
			link[x]=y;
			ans += e.dist;
			if(++cnt==n-1)
				break;
		}
		System.out.println(ans);

	}

}
