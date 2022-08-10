package step27_two_pointer;

import java.util.*;

public class Problem_1450 {
	static int arrN, brrN, k;
	static int[] arr, brr;
	
	static List<Long> sumList = new ArrayList<>();
	static List<Long> sumList2 = new ArrayList<>();
	
	static void f(int idx, long sum, int[] src, List<Long> dst) {
		if (idx==src.length) {
			dst.add(sum);
			return;
		}
		f(idx+1, sum, src, dst);
		f(idx+1, sum+src[idx], src, dst);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		k = sc.nextInt();

		int arrN = n-n/2;
		int[] arr = new int[arrN];
		for (int i=0; i<arrN; ++i)
			arr[i] = sc.nextInt();

		int brrN = n-arrN;
		int[] brr = new int[brrN];
		for (int i=0; i<brrN; ++i)
			brr[i] = sc.nextInt();
		
		f(0,0, arr, sumList);
		f(0,0, brr, sumList2);
		sumList.sort((a,b)->Long.compare(a,b));
		
		int ans = 0;
		for (Long x: sumList2) {
			if (x>k) continue;
			int lo=0, hi=sumList.size()-1, cnt=0;
			while (lo<=hi) {
				int mid = lo+hi>>1;
				if (sumList.get(mid)<=k-x) {
					lo=mid+1;
					cnt=mid;
				}
				else hi=mid-1;
			}
			ans+=cnt+1;
		}
		System.out.println(ans);
	}

}
