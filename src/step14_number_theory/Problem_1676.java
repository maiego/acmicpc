package step14_number_theory;

import java.io.*;
import java.util.*;

public class Problem_1676 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int cnt5=0;
		int x = n;
		while (x>0) {
			cnt5 += x/5;
			x/=5;
		}
		
		System.out.println(cnt5);

	}

}
