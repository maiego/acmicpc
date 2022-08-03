package step19_stack;

import java.util.*;

public class Problem_10828 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        Deque<Integer> st = new ArrayDeque<>();
        int q = sc.nextInt();
        while (q-->0) {
            String cmd = sc.next();
            if (cmd.equals("push")) {
                int x = sc.nextInt();
                st.push(x);
            } else if (cmd.equals("pop")) {
                if (st.isEmpty()) {
                    sb.append("-1\n");
                } else {
                    sb.append(st.poll()).append('\n');
                }
            } else if (cmd.equals("size")) {
                sb.append(st.size()).append('\n');
            } else if (cmd.equals("empty")) {
                sb.append(st.isEmpty() ? 1 : 0).append('\n');
            } else { //top
                if (st.isEmpty()) {
                    sb.append("-1\n");
                } else {
                    sb.append(st.peek()).append('\n');
                }
            }
        }
        System.out.println(sb);

    }

}
