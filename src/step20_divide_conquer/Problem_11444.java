package step20_divide_conquer;

import java.util.*;

public class Problem_11444 {
    final static int mod = (int)1e9+7;
    
    static int mul(int a, int b) {
        return (int)(1L*a*b%mod);
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
        int[][] ret = new int[2][2];
        if (k==0) {
            ret[0][0]=1;
            ret[1][1]=1;
            return ret;
        }
        ret = p(A, k/2);
        ret = mult(ret, ret);
        if (k%2==0) return ret;
        return mult(ret, A);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long k = sc.nextLong();

        int[][] A = new int[2][2];
        A[0][0]=A[0][1]=A[1][0]=1;
        int[][] B = p(A, k);
        System.out.println(B[0][1]);

    }

}
