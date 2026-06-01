package hot100.linkedlist;

import hot100.common.*;
import java.util.*;

/**
 * mybatis 206. ReverseLinkedList
 */
public class P206_ReverseLinkedList {

    public ListNode reverseList(ListNode head) {
        // TODO
        return head;
    }

    public static void main(String[] args) {
        P206_ReverseLinkedList s = new P206_ReverseLinkedList();
        Assert.eq(ListNode.toString(s.reverseList(ListNode.of(1,2,3,4,5))), "[5,4,3,2,1]");
        Assert.summary();
    }
}
