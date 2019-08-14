package double_pointer.RemoveElement;

public class Solution {
    public int removeElement(int[] nums, int val) {
        int L = 0;
        int R = nums.length ;
        while (L < R){
            if(nums[L] == val){
                nums[L] = nums[R-1];
                R --;
            }else {
                L ++;
            }
        }
        return R;
    }
}
