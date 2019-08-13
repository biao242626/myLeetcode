package double_pointer.Rotate_List_61;

public class Test_8_10_R {
    public static void main(String[] args) {
        ListNode[] a = new ListNode[5];
        for(int i = 0; i < 5; i ++){
            a[i] = new ListNode(i + 1);
        }
        for(int i = 0; i < 4; i ++){
            a[i].next = a[i + 1];
        }
        a[4].next = null;
        Solution solution = new Solution();
        ListNode head = solution.rotateRight(a[0],2 );
        while (head != null){
            System.out.printf(" "+ head.val);
            head = head.next;
        }
    }
}
