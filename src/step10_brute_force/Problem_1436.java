package step10_brute_force;

import java.io.*;
import java.util.*;

public class Problem_1436 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int x = 665;
        
        while (n>0) {
            ++x;
            while (!Integer.valueOf(x).toString().contains("666")) ++x;
            --n;
        }
        System.out.println(x);
    }

}
