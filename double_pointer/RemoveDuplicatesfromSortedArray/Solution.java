package double_pointer.RemoveDuplicatesfromSortedArray;

public class Solution {
    public int removeDuplicates(int[] nums) {
        int L = 0;
        int R = 1;
        for(L = 0; L < nums.length - 1; L ++){
            while (R < nums.length){
                if(nums[L] == nums[R])
                    R++;
                else
                    break;
            }
            if(R >= nums.length)
                return L+1;
            nums[L + 1] = nums[R];
        }
        return L+1;
    }
}
