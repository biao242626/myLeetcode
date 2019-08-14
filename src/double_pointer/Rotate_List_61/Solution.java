package double_pointer.Rotate_List_61;

public class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        ListNode old_tail = head;
        int n = 1;
        while (old_tail.next != null){
            old_tail = old_tail.next;
            n ++;
        }
        old_tail.next = head;//成环
        ListNode new_tail = head;
        ListNode new_head = head;
        for (int i = 0; i < n - k % n - 1; i ++)
            new_tail = new_tail.next;
        new_head = new_tail.next;
        new_tail.next = null;//截断
        return new_head;
    }
}
