package hot100.tech;

import hot100.common.*;
import java.util.*;

/**
 * mybatis 75. SortColors
 */
public class P75_SortColors {

    public void sortColors(int[] nums) {
        // TODO
        return;
    }
    int[] runSortColors(int[] arr) { sortColors(arr); return arr; }

    public static void main(String[] args) {
        P75_SortColors s = new P75_SortColors();
        Assert.eq(s.runSortColors(new int[]{2,0,2,1,1,0}), new int[]{0,0,1,1,2,2});
        Assert.summary();
    }
}
