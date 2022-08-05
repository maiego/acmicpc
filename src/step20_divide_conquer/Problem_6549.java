package step20_divide_conquer;

import java.util.*;
import java.io.*;

public class Problem_6549 {

    static int n;
    static long[] arr;
    
    static long f(int s, int e) {
        int mid = s+e>>1;
        if (s==e) return arr[s];
        
        long ans = f(s, mid);
        ans = Math.max(ans, f(mid+1, e));
        
        long maxh = Math.min(arr[mid], arr[mid+1]);
        int left=mid-1, right=mid+2;
        long x = maxh * 2L;
        while (left>=s && right<=e) {
            if (arr[left]<arr[right]) {
                maxh = Math.min(maxh, arr[right++]);
            } else {
                maxh = Math.min(maxh, arr[left--]);
            }
            x = Math.max(x, maxh*(right-left-1));
        }
        
        while (left>=s) {
            maxh = Math.min(maxh, arr[left--]);
            x = Math.max(x, maxh*(right-left-1));
        }
        
        while (right<=e) {
            maxh = Math.min(maxh, arr[right++]);
            x = Math.max(x, maxh*(right-left-1));
        }
        
        ans = Math.max(ans, x);
        return ans;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = null;

        while (true) {
            st = new StringTokenizer(br.readLine());
            n = Integer.parseInt(st.nextToken());
            if (n==0) break;

            arr = new long[n];
            for (int i = 0; i < n; ++i) {
                arr[i] = Long.parseLong(st.nextToken());
            }
            sb.append(f(0,n-1)).append('\n');
        }
        System.out.println(sb);

    }

}
