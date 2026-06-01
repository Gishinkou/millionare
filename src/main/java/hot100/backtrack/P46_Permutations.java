package hot100.backtrack;

import hot100.common.*;
import java.util.*;

/**
 * mybatis 46. Permutations
 */
public class P46_Permutations {

    public List<List<Integer>> permute(int[] nums) {
        // TODO
        return new ArrayList<>();
    }

    public static void main(String[] args) {
        P46_Permutations s = new P46_Permutations();
        Assert.eq(s.permute(new int[]{1,2,3}).size(), 6);
        Assert.summary();
    }
}
