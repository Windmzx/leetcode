package ReverseNodesinkGroup;

class ListNode {
    int val;
    ListNode next;

    public ListNode(int x) {
        val = x;
    }
}

public class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode helpNode = new ListNode(-1);
        ListNode cur = head;
        int count = 0;

        ListNode curhead = head;
        ListNode curtail = helpNode;

        while (cur != null) {
            count++;
            if (count == k) {

                ListNode leftNode = cur.next;
                cur.next = null;
                ListNode revsrsedlist = reverse(curhead);
                curtail.next = revsrsedlist;

                curtail = curhead;
                while (curtail.next != null) {
                    curtail = curtail.next;
                }
                count = 0;
                curhead = leftNode;
                cur = leftNode;
                continue;

            }
            cur = cur.next;

        }

        return helpNode.next;
    }

    ListNode reverse(ListNode head) {
        ListNode cur = head;
        ListNode res = null;
        while (cur != null) {
            ListNode temp = cur.next;
            cur.next = res;
            res = cur;
            cur = temp;
        }
        return res;
    }
}
