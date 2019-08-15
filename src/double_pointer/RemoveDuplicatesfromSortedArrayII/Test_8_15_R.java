package double_pointer.RemoveDuplicatesfromSortedArrayII;

public class Test_8_15_R {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,2,2,3,3,3};
        Solution solution = new Solution();
        int n = solution.removeDuplicates(nums);
        System.out.println("n="+n);
        for(int i : nums)
        System.out.printf(" "+i);
    }
}
