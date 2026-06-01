package hot100.heap;

import hot100.common.*;
import java.util.*;

/**
 * mybatis 347. TopKFrequentElements
 */
public class P347_TopKFrequentElements {

    public int[] topKFrequent(int[] nums, int k) {
        // TODO
        return new int[0];
    }

    public static void main(String[] args) {
        P347_TopKFrequentElements s = new P347_TopKFrequentElements();
        Assert.eq(s.topKFrequent(new int[]{1,1,1,2,2,3}, 2).length, 2);
        Assert.summary();
    }
}
