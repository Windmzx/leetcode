package swapPairs;

class ListNode {
    int val;
    ListNode next;

    public ListNode(int x) {
        val = x;
    }
}

public class Solution {

    public ListNode swapPairs(ListNode head) {
        ListNode p = new ListNode(1);
        ListNode res = p;
        p.next = head;
        ListNode p1 = head.next;
        ListNode p2 = head.next.next;
        while (p != null && p1 != null && p2 != null) {
            p1.next = p2.next;
            p2.next = p1;
            p.next = p2;

            p = p.next.next;
            p1 = p.next.next;
            p2 = p2.next.next;
        }
        return res.next;
    }
}
