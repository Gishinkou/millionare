package hot100.substring;

import hot100.common.*;
import java.util.*;

/**
 * mybatis 239. SlidingWindowMaximum
 */
public class P239_SlidingWindowMaximum {

    public int[] maxSlidingWindow(int[] nums, int k) {
        // TODO
        return new int[0];
    }

    public static void main(String[] args) {
        P239_SlidingWindowMaximum s = new P239_SlidingWindowMaximum();
        Assert.eq(s.maxSlidingWindow(new int[]{1,3,-1,-3,5,3,6,7}, 3), new int[]{3,3,5,5,6,7});
        Assert.summary();
    }
}
