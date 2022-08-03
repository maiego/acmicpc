package step20_queue;

import java.util.*;

public class Problem_18258 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        
        Deque<Integer> q = new ArrayDeque<>();
        int n = sc.nextInt();
        while (n-->0) {
            String cmd = sc.next();
            if (cmd.equals("push")) {
                int x = sc.nextInt();
                q.add(x);
            } else if (cmd.equals("pop")) {
                if (q.isEmpty()) {
                    sb.append("-1\n");
                } else {
                    sb.append(q.pop()).append('\n');
                }
            } else if (cmd.equals("size")) {
                sb.append(q.size()).append('\n');
            } else if (cmd.equals("empty")) {
                sb.append(q.isEmpty() ? 1 : 0).append('\n');
            } else if (cmd.equals("front")) {
                if (q.isEmpty()) {
                    sb.append("-1\n");
                } else {
                    sb.append(q.peekFirst()).append('\n');
                }
            } else if (cmd.equals("back")) {
                if (q.isEmpty()) {
                    sb.append("-1\n");
                } else {
                    sb.append(q.peekLast()).append('\n');
                }
            }
        }
        System.out.println(sb);
    }

}
