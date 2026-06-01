package hot100.graph;

import hot100.common.*;
import java.util.*;

/**
 * mybatis 200. NumberOfIslands
 */
public class P200_NumberOfIslands {

    public int numIslands(char[][] grid) {
        // TODO
        return 0;
    }

    public static void main(String[] args) {
        P200_NumberOfIslands s = new P200_NumberOfIslands();
        Assert.eq(s.numIslands(new char[][]{{'1','1','0'},{'1','1','0'},{'0','0','1'}}), 2);
        Assert.summary();
    }
}
