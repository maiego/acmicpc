package step15_backtracking;

import java.io.*;
import java.util.*;

public class Problem_2580 {
	final static int n = 9;
	static int[][] board = new int[n][n];
	static int[][] ans = new int[n][n];
	static List<Item> list = new ArrayList<>();
	static boolean done;
	
	static class Item { int y,x; }
	
	static boolean pos(int y, int x, int k) {
		int yy = y/3*3, xx=x/3*3;
		for (int i=yy; i<yy+3; ++i)
		for (int j=xx; j<xx+3; ++j)
			if (board[i][j]==k) return false;
		
		for (int i=0; i<n; ++i)
			if (board[y][i]==k || board[i][x]==k)
				return false;
		return true;
	}
	
	static void f() {
		if (done) return;
		int y=-1, x=-1;
		for (int i=0; i<n; ++i) {
			for (int j=0; j<n; ++j) {
				if (board[i][j]==0) {
					y=i; x=j;
					break;
				}
			}
			if (y!=-1) break;
		}
		if (y==-1) {
			for (int i=0; i<n; ++i)
				for (int j=0; j<n; ++j)
					ans[i][j]=board[i][j];
			done=true;
			return;
		}
		for (int i=1; i<=n; ++i) {
			if (!pos(y,x,i)) continue;
			board[y][x]=i;
			f();
			board[y][x]=0;
		}
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = null;
		
		for (int i=0; i<n; ++i) {
			st = new StringTokenizer(br.readLine());
			for (int j=0; j<n; ++j) {
				board[i][j] = Integer.parseInt(st.nextToken());
				if (board[i][j]==0) {
					Item item = new Item();
					item.y=i; item.x=j;
					list.add(item);
				}
			}
		}

		f();
		
		for (int i=0; i<n; ++i) {
			for (int j=0; j<n; ++j)
				sb.append(ans[i][j]).append(' ');
			sb.append('\n');
		}

		System.out.println(sb);
	}

}
