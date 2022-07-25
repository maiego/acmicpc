package step7_math1;

import java.io.*;
import java.math.BigDecimal;
import java.util.*;

public class Problem_10757 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		BigDecimal a = new BigDecimal(st.nextToken());
		BigDecimal b = new BigDecimal(st.nextToken());
		
		sb.append(a.add(b).toString());
		System.out.println(sb);
	}

}
