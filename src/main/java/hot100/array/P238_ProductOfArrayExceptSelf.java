package hot100.array;

import hot100.common.*;
import java.util.*;

/**
 * mybatis 238. ProductOfArrayExceptSelf
 */
public class P238_ProductOfArrayExceptSelf {

    public int[] productExceptSelf(int[] nums) {
        // TODO
        return new int[0];
    }

    public static void main(String[] args) {
        P238_ProductOfArrayExceptSelf s = new P238_ProductOfArrayExceptSelf();
        Assert.eq(s.productExceptSelf(new int[]{1,2,3,4}), new int[]{24,12,8,6});
        Assert.summary();
    }
}
