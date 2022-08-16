package step25_graph_traversal;

import java.util.*;

public class Problem_7576 {
	static int h,w;
	static int[][] board;
	
	static int[] dy = {-1,1,0,0};
	static int[] dx = {0,0,-1,1};
	
	static class Item {
		int y,x, cnt;
		Item(int a, int b, int c) {
			y=a; x=b; cnt=c;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		h = sc.nextInt();
		w = sc.nextInt();

		board = new int[h][w];
		for (int i=0; i<h; ++i)
			for (int j=0; j<w; ++j)
				board[i][j] = sc.nextInt();
		
		Deque<Item> q = new ArrayDeque<>();
		for (int i=0; i<h; ++i)
			for (int j=0; j<w; ++j)
				if (board[i][j]==1)
					q.add(new Item(i,j,0));

		while (!q.isEmpty()) {
			Item item = q.pop();
			int y=item.y, x=item.x, cnt=item.cnt;
		}

	}

}
