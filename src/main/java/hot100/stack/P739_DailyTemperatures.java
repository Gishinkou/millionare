package hot100.stack;

import hot100.common.*;
import java.util.*;

/**
 * mybatis 739. DailyTemperatures
 */
public class P739_DailyTemperatures {

    public int[] dailyTemperatures(int[] temperatures) {
        // TODO
        return new int[0];
    }

    public static void main(String[] args) {
        P739_DailyTemperatures s = new P739_DailyTemperatures();
        Assert.eq(s.dailyTemperatures(new int[]{73,74,75,71,69,72,76,73}), new int[]{1,1,4,2,1,1,0,0});
        Assert.summary();
    }
}
