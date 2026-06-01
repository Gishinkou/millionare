package hot100.binarysearch;

import hot100.common.*;
import java.util.*;

/**
 * mybatis 74. SearchA2DMatrix
 */
public class P74_SearchA2DMatrix {

    public boolean searchMatrix(int[][] matrix, int target) {
        // TODO
        return false;
    }

    public static void main(String[] args) {
        P74_SearchA2DMatrix s = new P74_SearchA2DMatrix();
        Assert.eq(s.searchMatrix(new int[][]{{1,3,5,7},{10,11,16,20},{23,30,34,60}}, 3), true);
        Assert.summary();
    }
}
