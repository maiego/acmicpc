package step19_stack;

import java.util.*;

public class Problem_4949 {
    static boolean check(char[] s) {
        Deque<Character> st = new ArrayDeque<>();
        for (char c: s) {
            if (c=='[' || c=='(')
                st.push(c);
            else if (c==']') {
                if (st.isEmpty() || st.pop() != '[')
                    return false;
            }
            else if (c==')') {
                if (st.isEmpty() || st.pop() != '(')
                    return false;
            }
        }
        return st.isEmpty();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            String line = sc.nextLine();
            if (line.equals("."))
                break;
            
            if (check(line.toCharArray()))
                System.out.println("yes");
            else
                System.out.println("no");
        }
    }

}
