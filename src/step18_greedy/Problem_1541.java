package step18_greedy;

import java.util.*;

public class Problem_1541 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] s = sc.nextLine().toCharArray();
        
        int num=0, ans=0;
        boolean flag = false;
        for (int i=0; i<s.length; ++i) {
            if (s[i]=='+') {
                if (flag) ans -= num;
                else ans += num;
                num=0;
            } else if (s[i]=='-') {
                if (flag) ans -= num;
                else ans += num;
                num = 0;
                flag=true;
            } else {
                num = num*10 + s[i]-'0';
            }
        }
        if (flag) ans -= num;
        else ans += num;

        System.out.println(ans);

    }

}
