package hot100.backtrack;

import hot100.common.*;
import java.util.*;

/**
 * mybatis 79. WordSearch
 */
public class P79_WordSearch {

    public boolean exist(char[][] board, String word) {
        // TODO
        return false;
    }

    public static void main(String[] args) {
        P79_WordSearch s = new P79_WordSearch();
        Assert.eq(s.exist(new char[][]{{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}}, "ABCCED"), true);
        Assert.summary();
    }
}
