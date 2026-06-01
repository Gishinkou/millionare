package hot100.linkedlist;

import hot100.common.*;
import java.util.*;

/**
 * mybatis 2. AddTwoNumbers
 */
public class P2_AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // TODO
        return null;
    }

    public static void main(String[] args) {
        P2_AddTwoNumbers s = new P2_AddTwoNumbers();
        Assert.eq(ListNode.toString(s.addTwoNumbers(ListNode.of(2,4,3), ListNode.of(5,6,4))), "[7,0,8]");
        Assert.summary();
    }
}
