package step25_graph_traversal;

import java.util.*;

public class Problem_2178 {
	
	static int h,w;
	static char[][] board;
	
	final static int[] dy = {-1,1,0,0};
	final static int[] dx = {0,0,-1,1};
	
	static class Item {
		int y,x, cnt;
		Item(int a, int b, int c) {
			y=a; x=b; cnt=c;
		}
	}
	
	static boolean inRange(int y, int x) {
		return y>=0 && x>=0 && y<h && x<w;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		h = sc.nextInt();
		w = sc.nextInt();
		board = new char[h][];
		for (int i=0; i<h; ++i)
			board[i] = sc.next().toCharArray();
		
		int ans = 0;
		Deque<Item> q = new ArrayDeque<>();
		q.add(new Item(0,0,1));
		boolean[][] vis = new boolean[h][w];
		while (!q.isEmpty()) {
			Item item = q.pop();
			int y = item.y, x = item.x;
			if (y==h-1 && x==w-1) {
				ans = item.cnt;
				break;
			}

			if (vis[y][x]) continue;
			vis[y][x] = true;
			
			for (int d=0; d<4; ++d) {
				int ny = dy[d]+y;
				int nx = dx[d]+x;
				if (inRange(ny,nx) && board[ny][nx]=='1')
					q.add(new Item(ny, nx, item.cnt+1));
			}
		}

		System.out.println(ans);

	}

}
