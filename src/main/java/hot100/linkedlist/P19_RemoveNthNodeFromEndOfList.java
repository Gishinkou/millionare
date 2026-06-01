package hot100.linkedlist;

import hot100.common.*;
import java.util.*;

/**
 * mybatis 19. RemoveNthNodeFromEndOfList
 */
public class P19_RemoveNthNodeFromEndOfList {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        // TODO
        return head;
    }

    public static void main(String[] args) {
        P19_RemoveNthNodeFromEndOfList s = new P19_RemoveNthNodeFromEndOfList();
        Assert.eq(ListNode.toString(s.removeNthFromEnd(ListNode.of(1,2,3,4,5), 2)), "[1,2,3,5]");
        Assert.summary();
    }
}
