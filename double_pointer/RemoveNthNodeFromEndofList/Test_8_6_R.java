package double_pointer.RemoveNthNodeFromEndofList;

public class Test_8_6_R {
    public static void main(String[] args) {
        ListNode[] array = new ListNode[6];
        for(int i = 1;i <= 5;i ++){
            array[i] = new ListNode(i);
        }
        for(int i = 1;i < 5;i ++){
            array[i].next = array[i +1];
        }
        array[5].next = null;
        ListNode an = new Solution().removeNthFromEnd(array[1],5 );
        while (an != null) {
            System.out.printf(" " + an.val);
            an = an.next;
        }
    }
}
