package hot100.array;

import hot100.common.*;
import java.util.*;

/**
 * mybatis 41. FirstMissingPositive
 */
public class P41_FirstMissingPositive {

    public int firstMissingPositive(int[] nums) {
        // TODO
        return 0;
    }

    public static void main(String[] args) {
        P41_FirstMissingPositive s = new P41_FirstMissingPositive();
        Assert.eq(s.firstMissingPositive(new int[]{1,2,0}), 3);
        Assert.eq(s.firstMissingPositive(new int[]{3,4,-1,1}), 2);
        Assert.summary();
    }
}
