package hot100.dp;

import hot100.common.*;
import java.util.*;

/**
 * mybatis 32. LongestValidParentheses
 */
public class P32_LongestValidParentheses {

    public int longestValidParentheses(String s) {
        // TODO
        return 0;
    }

    public static void main(String[] args) {
        P32_LongestValidParentheses s = new P32_LongestValidParentheses();
        Assert.eq(s.longestValidParentheses("(()"), 2);
        Assert.eq(s.longestValidParentheses(")()())"), 4);
        Assert.summary();
    }
}
