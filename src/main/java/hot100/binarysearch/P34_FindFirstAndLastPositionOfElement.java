package hot100.binarysearch;

import hot100.common.*;
import java.util.*;

/**
 * mybatis 34. FindFirstAndLastPositionOfElement
 */
public class P34_FindFirstAndLastPositionOfElement {

    public int[] searchRange(int[] nums, int target) {
        // TODO
        return new int[]{-1,-1};
    }

    public static void main(String[] args) {
        P34_FindFirstAndLastPositionOfElement s = new P34_FindFirstAndLastPositionOfElement();
        Assert.eq(s.searchRange(new int[]{5,7,7,8,8,10}, 8), new int[]{3,4});
        Assert.summary();
    }
}
