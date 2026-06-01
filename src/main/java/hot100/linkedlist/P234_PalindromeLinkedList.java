package hot100.linkedlist;

import hot100.common.*;
import java.util.*;

/**
 * mybatis 234. PalindromeLinkedList
 */
public class P234_PalindromeLinkedList {

    public boolean isPalindrome(ListNode head) {
        // TODO
        return false;
    }

    public static void main(String[] args) {
        P234_PalindromeLinkedList s = new P234_PalindromeLinkedList();
        Assert.eq(s.isPalindrome(ListNode.of(1,2,2,1)), true);
        Assert.eq(s.isPalindrome(ListNode.of(1,2)), false);
        Assert.summary();
    }
}
