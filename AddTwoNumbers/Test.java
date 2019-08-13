package AddTwoNumbers;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode l1 = new ListNode(7);
        //l1.next = new ListNode(6);
        //l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(3);
        //l2.next = new ListNode(2);
        //l2.next.next = new ListNode(2);

        ListNode re = solution.addTwoNumbers(l1, l2);
        while (re != null){
            System.out.print(re.val);
            re = re.next;
        }
    }
}
