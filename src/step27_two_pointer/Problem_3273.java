package step27_two_pointer;

import java.util.*;

public class Problem_3273 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i=0; i<n; ++i)
			arr[i] = sc.nextInt();
		Arrays.sort(arr);
		int k = sc.nextInt();

		int ans=0;
		int left=0, right=n-1;
		int sum=arr[left]+arr[right];
		while (left<right) {
			if (sum==k) ++ans;
			if (sum<k) {
				sum-=arr[left];
				sum+=arr[++left];
			}
			else {
				sum -= arr[right];
				sum += arr[--right];
			}
		}
		System.out.println(ans);
	}

}
