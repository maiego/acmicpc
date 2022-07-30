package step14_number_theory;

import java.io.*;
import java.util.*;

public class Problem_9375 {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int T = sc.nextInt();
		while (T-->0) {
		    int n = sc.nextInt();
		    Map<String, Integer> m = new HashMap<>();
		    while (n-->0) {
		    	sc.next();
		    	String s = sc.next();
		    	m.put(s, m.getOrDefault(s, 0)+1);
		    }
		    int ans = 1;
		    for (String k: m.keySet()) {
		    	ans *= 1+m.get(k);
		    }
		    sb.append(ans-1).append('\n');
		}
		System.out.println(sb);
	}

}
