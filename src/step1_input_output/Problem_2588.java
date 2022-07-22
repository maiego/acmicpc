package step1_input_output;

import java.util.Scanner;

public class Problem_2588 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int ans = a*b;
		while (b>0) {
			int c = b%10;
			System.out.println(a*c);
			b/=10;
		}
		System.out.println(ans);
	}

}
