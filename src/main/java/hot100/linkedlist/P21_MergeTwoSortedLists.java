package hot100.linkedlist;

import hot100.common.*;
import java.util.*;

/**
 * mybatis 21. MergeTwoSortedLists
 */
public class P21_MergeTwoSortedLists {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // TODO
        return null;
    }

    public static void main(String[] args) {
        P21_MergeTwoSortedLists s = new P21_MergeTwoSortedLists();
        Assert.eq(ListNode.toString(s.mergeTwoLists(ListNode.of(1,2,4), ListNode.of(1,3,4))), "[1,1,2,3,4,4]");
        Assert.summary();
    }
}
