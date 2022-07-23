package step5_function;

public class Problem_15596 {
	long sum(int[] a) {
		long ans=0;
		int sz = a.length;
		for (int i=0; i<sz; ++i)
			ans+=a[i];
		return ans;
	}
}
