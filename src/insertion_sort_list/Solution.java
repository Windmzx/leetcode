package insertion_sort_list;

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class Solution {
    public ListNode insertionSortList(ListNode head) {
        if (head == null || head.next == null)
            return head;

        ListNode newlist = new ListNode(0);
        ListNode curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            ListNode phead = newlist;

            while (phead.next != null && phead.next.val < curr.val) {
                phead = phead.next;
            }
            curr.next = phead.next;
            phead.next = curr;
            curr = next;
        }
        return newlist;
    }

    public static void main(String[] args) {

    }
}