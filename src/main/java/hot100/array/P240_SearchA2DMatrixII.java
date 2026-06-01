package hot100.array;

import hot100.common.*;
import java.util.*;

/**
 * mybatis 240. SearchA2DMatrixII
 */
public class P240_SearchA2DMatrixII {

    public boolean searchMatrix(int[][] matrix, int target) {
        // TODO
        return false;
    }

    public static void main(String[] args) {
        P240_SearchA2DMatrixII s = new P240_SearchA2DMatrixII();
        Assert.eq(s.searchMatrix(new int[][]{{1,4,7,11},{2,5,8,12},{3,6,9,16},{10,13,14,17}}, 5), true);
        Assert.eq(s.searchMatrix(new int[][]{{1,4,7,11},{2,5,8,12}}, 20), false);
        Assert.summary();
    }
}
