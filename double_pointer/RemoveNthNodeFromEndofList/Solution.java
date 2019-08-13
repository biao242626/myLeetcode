package double_pointer.RemoveNthNodeFromEndofList;

public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode L = head;
        ListNode R = head;
        int i;
        for(i = 0; i < n; i ++)
            R = R.next;
        if( R == null)
            return head.next;
        while (R.next != null){
            R = R.next;
            L = L.next;
        }
            L.next = L.next.next;
        return head;
    }
}
