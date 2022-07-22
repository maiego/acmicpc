package step2_condition;

import java.util.Scanner;

public class Problem_2525 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int h = sc.nextInt();
		int m = sc.nextInt();
		int plusTime = sc.nextInt();
		
		m += plusTime;
		
		if (m>=60) {
			h += (m/60);
			m %= 60;
		}
		
		if (h>=24) {
			h-=24;
		}
		System.out.println(h + " " + m);
	}

}
