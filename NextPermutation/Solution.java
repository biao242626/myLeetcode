package NextPermutation;

public class Solution {
    public void nextPermutation(int[] nums) {
        int i = nums.length - 2;
        while (i >= 0 && nums[i+1] <= nums[i])
            i--;
        if (i >= 0){
            int j = nums.length - 1;
            while (j >= i && nums[j] <= nums[i])
                j --;
            swap(nums, i , j);
        }
        reverse(nums,i+1);
    }
    public void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public void reverse(int[] nums, int start){
        int i = start;
        int j = nums.length - 1;
        while (i < j){//不能用是否相等来判断
            swap(nums, i, j);
            i ++;
            j --;
        }
    }
}