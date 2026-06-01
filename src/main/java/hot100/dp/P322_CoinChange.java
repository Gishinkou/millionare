package hot100.dp;

import hot100.common.*;
import java.util.*;

/**
 * mybatis 322. CoinChange
 */
public class P322_CoinChange {

    public int coinChange(int[] coins, int amount) {
        // TODO
        return -1;
    }

    public static void main(String[] args) {
        P322_CoinChange s = new P322_CoinChange();
        Assert.eq(s.coinChange(new int[]{1,2,5}, 11), 3);
        Assert.eq(s.coinChange(new int[]{2}, 3), -1);
        Assert.summary();
    }
}
