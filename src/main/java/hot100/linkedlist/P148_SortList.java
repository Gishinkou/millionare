package hot100.linkedlist;

import hot100.common.*;
import java.util.*;

/**
 * mybatis 148. SortList
 */
public class P148_SortList {

    public ListNode sortList(ListNode head) {
        // TODO
        return head;
    }

    public static void main(String[] args) {
        P148_SortList s = new P148_SortList();
        Assert.eq(ListNode.toString(s.sortList(ListNode.of(4,2,1,3))), "[1,2,3,4]");
        Assert.summary();
    }
}
