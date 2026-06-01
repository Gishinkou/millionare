package hot100.backtrack;

import hot100.common.*;
import java.util.*;

/**
 * mybatis 22. GenerateParentheses
 */
public class P22_GenerateParentheses {

    public List<String> generateParenthesis(int n) {
        // TODO
        return new ArrayList<>();
    }

    public static void main(String[] args) {
        P22_GenerateParentheses s = new P22_GenerateParentheses();
        Assert.eq(s.generateParenthesis(3).size(), 5);
        Assert.summary();
    }
}
