package hot100.binarysearch;

import hot100.common.*;
import java.util.*;

/**
 * mybatis 35. SearchInsertPosition
 */
public class P35_SearchInsertPosition {

    public int searchInsert(int[] nums, int target) {
        // TODO
        return 0;
    }

    public static void main(String[] args) {
        P35_SearchInsertPosition s = new P35_SearchInsertPosition();
        Assert.eq(s.searchInsert(new int[]{1,3,5,6}, 5), 2);
        Assert.eq(s.searchInsert(new int[]{1,3,5,6}, 2), 1);
        Assert.summary();
    }
}
