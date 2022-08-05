package step20_divide_conquer;

import java.util.*;

public class Problem_10830 {
    final static int mod = 1000;
    static int n;
    static long k;
    
    static int mul(int a, int b) {
        return a*b%mod;
    }
    
    static int[][] mult(int[][] A, int[][] B) {
        int h = A.length;
        int w = B[0].length;
        int[][] C = new int[h][w];
        for (int i=0; i<h; ++i) {
            for (int j=0; j<w; ++j) {
                for (int ii=0; ii<A[0].length; ++ii) {
                    C[i][j] += mul(A[i][ii],B[ii][j]);
                    C[i][j] %= mod;
                }
            }
        }

        return C;
    }
    
    static int[][] p(int[][] A, long k) {
        int[][] ret = new int[n][n];
        if (k==0) {
            for (int i=0; i<n; ++i)
                ret[i][i]=1;
            return ret;
        }
        
        ret = p(A, k/2);
        ret = mult(ret, ret);
        if (k%2==0) return ret;
        return mult(A, ret);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextLong();

        int[][] A = new int[n][n];
        for (int i=0; i<n; ++i)
            for (int j=0; j<n; ++j)
                A[i][j] = sc.nextInt();

        int[][] C = p(A,k);
        for (int i=0; i<C.length; ++i) {
            for (int j=0; j<C[0].length; ++j)
                System.out.print(C[i][j] + " ");
            System.out.println();
        }
    }

}
