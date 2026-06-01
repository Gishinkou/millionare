package hot100.array;

import hot100.common.*;
import java.util.*;

/**
 * mybatis 54. SpiralMatrix
 */
public class P54_SpiralMatrix {

    public List<Integer> spiralOrder(int[][] matrix) {
        // TODO
        return new ArrayList<>();
    }

    public static void main(String[] args) {
        P54_SpiralMatrix s = new P54_SpiralMatrix();
        Assert.eq(s.spiralOrder(new int[][]{{1,2,3},{4,5,6},{7,8,9}}).toString(), "[1, 2, 3, 6, 9, 8, 7, 4, 5]");
        Assert.summary();
    }
}
