package step22_parametric_search;

import java.util.*;

public class Problem_1920 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i=0; i<n; ++i)
			arr[i] = sc.nextInt();
		
		Arrays.sort(arr);
		int q = sc.nextInt();
		while (q-->0) {
			int x = sc.nextInt();
		    if (Arrays.binarySearch(arr, x)<0)
		    	System.out.println(0);
		    else
		    	System.out.println(1);
		}

	}

}
