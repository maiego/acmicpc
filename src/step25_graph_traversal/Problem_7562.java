package step25_graph_traversal;

import java.util.*;

public class Problem_7562 {
	static int[] dy = {-1,1,-1,1,2,2,-2,-2};
	static int[] dx = {2,2,-2,-2,-1,1,-1,1};
	
	static int n;
	
	static class Item {
		int y,x, cnt;
		Item(int a, int b, int c) {
			y=a; x=b; cnt=c;
		}
	}
	
	static boolean inRange(int y, int x) {
		return y>=0 && x>=0 && y<n && x<n;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();

		int T = sc.nextInt();
		while (T-->0) {
			n = sc.nextInt();
			int sy = sc.nextInt();
			int sx = sc.nextInt();
			int ey = sc.nextInt();
			int ex = sc.nextInt();
			
			int ans = 0;
			Deque<Item> q = new ArrayDeque<>();
			q.add(new Item(sy,sx,0));
			boolean[][] vis = new boolean[n][n];
			while (!q.isEmpty()) {
				Item item = q.pop();
				int y=item.y, x=item.x, cnt=item.cnt;
				
				if (y==ey && x==ex) {
					ans = cnt;
					break;
				}

				if (vis[y][x]) continue;
				vis[y][x] = true;

				for (int d=0; d<8; ++d) {
					int ny = dy[d]+y;
					int nx = dx[d]+x;
					if (inRange(ny,nx) && !vis[ny][nx])
						q.add(new Item(ny,nx, cnt+1));
				}
			}
			sb.append(ans).append('\n');

		}
		System.out.println(sb);

	}

}
