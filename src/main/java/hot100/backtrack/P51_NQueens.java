package hot100.backtrack;

import hot100.common.*;
import java.util.*;

/**
 * mybatis 51. NQueens
 */
public class P51_NQueens {

    public List<List<String>> solveNQueens(int n) {
        // TODO
        return new ArrayList<>();
    }

    public static void main(String[] args) {
        P51_NQueens s = new P51_NQueens();
        Assert.eq(s.solveNQueens(4).size(), 2);
        Assert.summary();
    }
}
