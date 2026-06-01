package hot100.backtrack;

import hot100.common.*;
import java.util.*;

/**
 * mybatis 78. Subsets
 */
public class P78_Subsets {

    public List<List<Integer>> subsets(int[] nums) {
        // TODO
        return new ArrayList<>();
    }

    public static void main(String[] args) {
        P78_Subsets s = new P78_Subsets();
        Assert.eq(s.subsets(new int[]{1,2,3}).size(), 8);
        Assert.summary();
    }
}
