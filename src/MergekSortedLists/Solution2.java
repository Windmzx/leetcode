package MergekSortedLists;


public class Solution2 {
    public ListNode mergeKLists(ListNode[] lists) {

        if (lists.length == 1)
            return lists[0];
        if (lists.length == 2)
            return mergeTwoList(lists[0], lists[1]);
        ListNode l1 = lists[0];
        for (int i = 1; i < lists.length; i++) {
           l1= mergeTwoList(l1, lists[i]);
        }
        return l1;
    }


    public ListNode mergeTwoList(ListNode l1, ListNode l2) {
        if (l1 == null)
            return l2;
        if (l2 == null)
            return l1;
        ListNode head = null;
        if (l1.val <= l2.val) {
            head = l1;
            head.next = mergeTwoList(l1.next, l2);
        } else {
            head = l2;
            ListNode re = mergeTwoList(l1, l2.next);
            head.next = re;
        }
        return head;
    }

    public static void main(String[] args) {
        Solution2 s = new Solution2();
        ListNode s1 = new ListNode(2);


//        ListNode s2 = new ListNode(3);
//        s2.next = new ListNode(4);

        ListNode s2 = null;

        ListNode s3 = new ListNode(-1);

        System.out.println(s.mergeKLists(new ListNode[]{s1, s2, s3}));
    }
}
