package hot100.stack;

import hot100.common.*;
import java.util.*;

/**
 * mybatis 20. ValidParentheses
 */
public class P20_ValidParentheses {

    public boolean isValid(String s) {
        // TODO
        return false;
    }

    public static void main(String[] args) {
        P20_ValidParentheses s = new P20_ValidParentheses();
        Assert.eq(s.isValid("()"), true);
        Assert.eq(s.isValid("(]"), false);
        Assert.summary();
    }
}
