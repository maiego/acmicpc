package step19_stack;

import java.util.*;

public class Problem_1874 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; ++i)
            arr[i] = sc.nextInt();
        
        boolean fail = false;
        Deque<Integer> st = new ArrayDeque<>();
        int i=1;
        for (int x: arr) {
            while (i<=x) {
                st.push(i++);
                sb.append("+\n");
            }
            if (st.pop()!=x) {
                fail=true;
                break;
            }
            sb.append("-\n");
        }
        if (fail)
            System.out.println("NO");
        else
            System.out.println(sb);

    }

}
