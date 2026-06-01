package hot100.hashtable;

import hot100.common.*;
import java.util.*;

/**
 * mybatis 128. LongestConsecutiveSequence
 */
public class P128_LongestConsecutiveSequence {

    public int longestConsecutive(int[] nums) {
        // TODO
        return 0;
    }

    public static void main(String[] args) {
        P128_LongestConsecutiveSequence s = new P128_LongestConsecutiveSequence();
        Assert.eq(s.longestConsecutive(new int[]{100,4,200,1,3,2}), 4);
        Assert.eq(s.longestConsecutive(new int[]{0,3,7,2,5,8,4,6,0,1}), 9);
        Assert.summary();
    }
}
