package hot100.linkedlist;

import hot100.common.*;
import java.util.*;

/**
 * mybatis 24. SwapNodesInPairs
 */
public class P24_SwapNodesInPairs {

    public ListNode swapPairs(ListNode head) {
        // TODO
        return head;
    }

    public static void main(String[] args) {
        P24_SwapNodesInPairs s = new P24_SwapNodesInPairs();
        Assert.eq(ListNode.toString(s.swapPairs(ListNode.of(1,2,3,4))), "[2,1,4,3]");
        Assert.summary();
    }
}
