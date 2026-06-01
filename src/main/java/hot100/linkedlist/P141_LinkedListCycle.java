package hot100.linkedlist;

import hot100.common.*;
import java.util.*;

/**
 * mybatis 141. LinkedListCycle
 */
public class P141_LinkedListCycle {

    public boolean hasCycle(ListNode head) {
        // TODO
        return false;
    }

    public static void main(String[] args) {
        P141_LinkedListCycle s = new P141_LinkedListCycle();
        Assert.eq(s.hasCycle(ListNode.of(1,2,3)), false);
        Assert.summary();
    }
}
