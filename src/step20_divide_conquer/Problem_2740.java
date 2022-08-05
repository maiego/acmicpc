package step20_divide_conquer;

import java.util.*;

public class Problem_2740 {
    static int n,m,k;
    
    static int[][] mult(int[][] A, int[][] B) {
        int h = A.length;
        int w = B[0].length;
        int[][] C = new int[h][w];
        for (int i=0; i<h; ++i) {
            for (int j=0; j<w; ++j) {
                for (int ii=0; ii<A[0].length; ++ii)
                    C[i][j] += A[i][ii]*B[ii][j];
            }
        }

        return C;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        int[][] A = new int[n][m];
        for (int i=0; i<n; ++i)
            for (int j=0; j<m; ++j)
                A[i][j] = sc.nextInt();
        
        sc.nextInt();
        k = sc.nextInt();
        int[][] B = new int[m][k];
        for (int i=0; i<m; ++i)
            for (int j=0; j<k; ++j)
                B[i][j] = sc.nextInt();
        int[][] C = mult(A,B);
        for (int i=0; i<C.length; ++i) {
            for (int j=0; j<C[0].length; ++j)
                System.out.print(C[i][j] + " ");
            System.out.println();
        }
    }

}
