package MergekSortedLists;

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

public class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode res = new ListNode(0);
        boolean hasnum = true;

        while (hasnum) {
            hasnum = false;
            int minnum = Integer.MAX_VALUE;
            ListNode p = null;
            for (ListNode list : lists) {
                if (list != null && list.val < minnum) {
                    minnum = list.val;
                    hasnum = true;
                    p = list;
                }
            }
            p = p.next;
            res.next = new ListNode(minnum);
        }
        return res.next;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        ListNode s1 = new ListNode(1);
        s1.next = new ListNode(2);

        ListNode s2 = new ListNode(3);
        s2.next = new ListNode(4);
        s.mergeKLists(new ListNode[]{s1,s2});
    }
}
