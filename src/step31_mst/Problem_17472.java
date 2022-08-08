package step31_mst;

import java.util.*;

public class Problem_17472 {
	static int h,w;
	static int[][] board = new int[10][10];
	
	static int[] link;
	
	static int find(int x) {
		return x==link[x] ? x : (link[x]=find(link[x]));
	}
	
	static int dy[] = {-1,1,0,0};
	static int dx[] = {0,0,-1,1};
	
	static boolean inRange(int y, int x) {
		return y>=0 && x>=0 && y<h && x<w;
	}
	
	static void dfs(int y, int x, int color) {
		board[y][x]=color;
		for (int d=0; d<4; ++d) {
			int ny = dy[d]+y;
			int nx = dx[d]+x;
			if (inRange(ny,nx) && board[ny][nx]==1)
				dfs(ny,nx, color);
		}
	}
	
	static class Item {
		int y,x, dir, cnt, color;
		Item(int y, int x, int dir, int cnt, int color) {
			this.y = y;
			this.x = x;
			this.dir = dir;
			this.cnt = cnt;
			this.color = color;
		}
	}
	
	static class Edge {
		int u,v, dist;
		Edge(int a, int b, int c) {
			u=a; v=b; dist=c;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		h = sc.nextInt();
		w = sc.nextInt();
		for (int i=0; i<h; ++i)
		for (int j=0; j<w; ++j)
			board[i][j] = sc.nextInt();
		
		int color=1;
		for (int i=0; i<h; ++i)
		for (int j=0; j<w; ++j)
			if (board[i][j]==1)
				dfs(i,j, ++color);
		
		link = new int[color+1];
		for (int i=1; i<=color; ++i)
			link[i] = i;
		
		Deque<Item> q = new ArrayDeque<>();
		for (int i=0; i<h; ++i)
		for (int j=0; j<w; ++j)
			if (board[i][j]>0) {
				for (int d=0; d<4; ++d) {
					int ny = dy[d]+i;
					int nx = dx[d]+j;
					if (inRange(ny,nx) && board[ny][nx]==0)
						q.add(new Item(ny,nx,d,1,board[i][j]));
				}
			}

		List<Edge> edges = new ArrayList<>();
		while (!q.isEmpty()) {
			Item item = q.pop();
			int y=item.y, x=item.x;
			int ny=dy[item.dir]+y, nx=dx[item.dir]+x;
			if (!inRange(ny,nx)) continue;
			if (board[ny][nx]>0 && board[ny][nx]!=item.color) {
				if (item.cnt==1) continue;
				edges.add(new Edge(item.color, board[ny][nx], item.cnt));
				continue;
			}
			if (board[ny][nx]==0)
				q.add(new Item(ny,nx,item.dir,item.cnt+1,item.color));
		}
		
		edges.sort((a,b)->a.dist-b.dist);
		
		int ans=0, cnt=0;
		for (Edge e: edges) {
			int x=find(e.u), y=find(e.v);
			if (x==y) continue;
			link[x]=y;
			ans += e.dist;
			if (++cnt==color-2) break;
		}

		System.out.println(cnt==color-2 ? ans : -1);
	}

}
