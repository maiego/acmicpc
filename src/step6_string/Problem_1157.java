package step6_string;

import java.io.*;
import java.util.*;

public class Problem_1157 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] s = br.readLine().toUpperCase().toCharArray();
		
		int[] cntArr = new int[26];
		int maxv=0;
		for (char c : s) {
			int idx = c-'A';
			cntArr[idx]++;
			if (cntArr[idx]>maxv) maxv=cntArr[idx];
		}
		int cnt=0, maxIdx=0;
		for (int i=0; i<26; ++i) {
			if (cntArr[i]==maxv) {
				maxIdx=i;
				++cnt;
			}
		}
		if (cnt>1)
			System.out.println('?');
		else System.out.println((char)(maxIdx+'A'));

	}

}
