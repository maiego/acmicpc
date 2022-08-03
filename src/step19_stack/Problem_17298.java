package step19_stack;

import java.util.*;

public class Problem_17298 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; ++i)
            arr[i] = sc.nextInt();
        
        Deque<Integer> st = new ArrayDeque<>();
        st.push(arr[n-1]);
        int[] ans = new int[n];
        for (int i=n-1; i>=0; --i) {
            while (!st.isEmpty() && st.peek()<=arr[i])
                st.pop();
            if (st.isEmpty()) ans[i]=-1;
            else ans[i] = st.peek();
            st.push(arr[i]);
        }

        for (int x: ans)
            sb.append(x).append(' ');
        System.out.println(sb);
    }

}
