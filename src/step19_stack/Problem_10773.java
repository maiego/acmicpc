package step19_stack;

import java.util.*;

public class Problem_10773 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Deque<Integer> st = new ArrayDeque<>();
        long sum=0;
        while (n-->0) {
            int x = sc.nextInt();
            if (x==0) {
                sum -= st.pop();
            } else {
                st.push(x);
                sum += x;
            }
        }
        System.out.println(sum);
    }

}
