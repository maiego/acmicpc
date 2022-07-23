package step5_function;

import java.io.*;
import java.util.*;

public class Problem_4673 {

	static int[] mark = new int[10000];
	
	static void f(int x) {
		while (x<10000) {
			int next = x;
			while (x>0) {
				next += x%10;
				x/=10;
			}
			x=next;
			if (x<10000) {
				if (mark[x]==1) break;
				mark[x]=1;
			}
		}
	}

	public static void main(String[] args) throws Exception {
		for (int i=1; i<10000; ++i) {
			f(i);
		}
		StringBuilder sb = new StringBuilder();
		for (int i=1; i<10000; ++i)
			if (mark[i]==0) sb.append(i).append('\n');
		System.out.println(sb);
	}
}
