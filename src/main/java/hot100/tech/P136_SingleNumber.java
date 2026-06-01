package hot100.tech;

import hot100.common.*;
import java.util.*;

/**
 * mybatis 136. SingleNumber
 */
public class P136_SingleNumber {

    public int singleNumber(int[] nums) {
        // TODO
        return 0;
    }

    public static void main(String[] args) {
        P136_SingleNumber s = new P136_SingleNumber();
        Assert.eq(s.singleNumber(new int[]{2,2,1}), 1);
        Assert.eq(s.singleNumber(new int[]{4,1,2,1,2}), 4);
        Assert.summary();
    }
}
