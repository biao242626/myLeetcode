package double_pointer.RemoveDuplicatesfromSortedArray;

public class Test_8_7_R {
    public static void main(String[] args) {
        int[] a = new int[]{0};
        Solution solution = new Solution();
        int result = solution.removeDuplicates(a);
        System.out.println("result ="+result);
        for(int i: a)
            System.out.printf(" "+i);
    }
}
