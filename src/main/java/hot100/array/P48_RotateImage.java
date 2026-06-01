package hot100.array;

import hot100.common.*;
import java.util.*;

/**
 * mybatis 48. RotateImage
 */
public class P48_RotateImage {

    public void rotate(int[][] matrix) {
        // TODO
        return;
    }
    int[][] runRotateImg(int[][] m) { rotate(m); return m; }

    public static void main(String[] args) {
        P48_RotateImage s = new P48_RotateImage();
        Assert.eq(s.runRotateImg(new int[][]{{1,2,3},{4,5,6},{7,8,9}}), new int[][]{{7,4,1},{8,5,2},{9,6,3}});
        Assert.summary();
    }
}
