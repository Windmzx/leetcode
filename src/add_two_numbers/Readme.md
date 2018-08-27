You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Example:
```
Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8
Explanation: 342 + 465 = 807.
```
### 第一次
```java
public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int sum = 0;
        ListNode res = new ListNode(0);
        ListNode p = res;

        while (l1 != null || l2 != null) {
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            int v = sum % 10;
            res.next = new ListNode(v);
            res = res.next;
          sum/=10;


        }
        return p.next;
    }
```

### 第二次
```java
public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int sum = 0;
        ListNode res = new ListNode(0);
        ListNode p = res;

        while (l1 != null || l2 != null) {
            sum /= 10;
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            int v = sum % 10;
            res.next = new ListNode(v);
            res = res.next;
            if (sum / 10 == 1) {
                res.next = new ListNode(1);
            }


        }
        return p.next;
    }
```

第一次出错是没有考虑如果最后一次加法产生了进位，由于链表中已经没节点了，会导致这个进位知直接被丢弃。