package hot100.linkedlist;

import hot100.common.*;
import java.util.*;

/**
 * mybatis 25. ReverseNodesInKGroup
 */
public class P25_ReverseNodesInKGroup {

    public ListNode reverseKGroup(ListNode head, int k) {
        // TODO
        return head;
    }

    public static void main(String[] args) {
        P25_ReverseNodesInKGroup s = new P25_ReverseNodesInKGroup();
        Assert.eq(ListNode.toString(s.reverseKGroup(ListNode.of(1,2,3,4,5), 2)), "[2,1,4,3,5]");
        Assert.summary();
    }
}
