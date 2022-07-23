package step4_array;

import java.io.*;
import java.util.*;

public class Problem_3052 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		TreeSet<Integer> set = new TreeSet<>();
		for (int i=0; i<10; ++i)
			set.add(Integer.parseInt(br.readLine())%42);
		System.out.println(set.size());
	}

}
