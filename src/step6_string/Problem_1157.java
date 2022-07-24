package step6_string;

import java.io.*;
import java.util.*;

public class Problem_1157 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] s = br.readLine().toCharArray();
		
		int[] cntArr = new int[26];
		int maxv=0;
		for (char c : s) {
			int lowerC = (c>='a') ? c-'a'+'A' : c;
			cntArr[lowerC-'A']++;
			if (cntArr[lowerC-'A']>maxv) maxv=cntArr[lowerC-'A'];
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
