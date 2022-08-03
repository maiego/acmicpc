package step19_stack;

import java.util.*;

public class Problem_9012 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-->0) {
            Deque<Character> st = new ArrayDeque<>();
            char[] s = sc.next().toCharArray();
            boolean fail = false;
            for (char c: s) {
                if (c=='(') {
                    st.push(c);
                } else {
                    if (st.isEmpty()) {
                        fail=true;
                        break;
                    }
                    st.pop();
                }
            }
            if (!st.isEmpty()) fail=true;
            if (fail)
                System.out.println("NO");
            else
                System.out.println("YES");
        }

    }

}
