package hot100.array;

import hot100.common.*;
import java.util.*;

/**
 * mybatis 73. SetMatrixZeroes
 */
public class P73_SetMatrixZeroes {

    public void setZeroes(int[][] matrix) {
        // TODO
        return;
    }
    int[][] runSetZeroes(int[][] m) { setZeroes(m); return m; }

    public static void main(String[] args) {
        P73_SetMatrixZeroes s = new P73_SetMatrixZeroes();
        Assert.eq(s.runSetZeroes(new int[][]{{1,1,1},{1,0,1},{1,1,1}}), new int[][]{{1,0,1},{0,0,0},{1,0,1}});
        Assert.summary();
    }
}
