package hot100.backtrack;

import hot100.common.*;
import java.util.*;

/**
 * mybatis 131. PalindromePartitioning
 */
public class P131_PalindromePartitioning {

    public List<List<String>> partition(String s) {
        // TODO
        return new ArrayList<>();
    }

    public static void main(String[] args) {
        P131_PalindromePartitioning s = new P131_PalindromePartitioning();
        Assert.eq(s.partition("aab").size(), 2);
        Assert.summary();
    }
}
