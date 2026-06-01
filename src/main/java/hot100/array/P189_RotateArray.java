package hot100.array;

import hot100.common.*;
import java.util.*;

/**
 * mybatis 189. RotateArray
 */
public class P189_RotateArray {

    public void rotate(int[] nums, int k) {
        // TODO
        return;
    }
    int[] runRotate(int[] arr, int k) { rotate(arr, k); return arr; }

    public static void main(String[] args) {
        P189_RotateArray s = new P189_RotateArray();
        Assert.eq(s.runRotate(new int[]{1,2,3,4,5,6,7}, 3), new int[]{5,6,7,1,2,3,4});
        Assert.summary();
    }
}
