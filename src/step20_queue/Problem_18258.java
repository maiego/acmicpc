package step20_queue;

import java.io.*;
import java.util.*;

public class Problem_18258 {

    public static void main(String[] args) throws Exception {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
    	StringTokenizer st = null;
        
        Deque<Integer> q = new ArrayDeque<>();
        int n = Integer.parseInt(br.readLine());
        while (n-->0) {
            String[] line = br.readLine().split(" ");
            String cmd = line[0];
            if (cmd.equals("push")) {
            	int x = Integer.parseInt(line[1]);
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
