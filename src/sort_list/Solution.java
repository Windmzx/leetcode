package sort_list;

/**
 * Created by mzx on 2017/7/3.
 */
class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

class Solution {
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode p = head;
        ListNode q = head.next;
        while (q != null && q.next != null) {
            p = p.next;
            q = q.next.next;
        }
        ListNode left = sortList(p.next);
        p.next = null;
        ListNode right = sortList(head);
        return mergeTwoLists(left, right);
    }

     ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode p = head;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                p.next = l1;
                p = p.next;
                l1 = l1.next;
            } else {
                p.next = l2;
                p = p.next;
                l2 = l2.next;
            }
        }
        if (l1 != null)
            p.next = l1;

        if (l2 != null)
            p.next = l2;

        return head.next;
    }
}