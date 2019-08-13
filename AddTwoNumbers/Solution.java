package AddTwoNumbers;

public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode cur = result;
        int temp = 0;
        int jinwei = 0;
        while (l1 != null || l2 != null){//以最长的为界
            int x = l1 == null ? 0:l1.val;
            int y = l2 == null ? 0:l2.val;
            temp = x + y + jinwei;
            cur.next = new ListNode(temp % 10);
            cur = cur.next;
            jinwei = temp / 10;
            if(l1 != null)
                l1 = l1.next;
            if(l2 != null)
                l2 = l2.next;
        }
        if(jinwei == 1)
            cur.next = new ListNode(1);
        return result.next;
    }
}
