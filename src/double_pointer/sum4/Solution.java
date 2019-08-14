package double_pointer.sum4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        for(int first = 0;first < nums.length; first ++){
            if (first > 0 && nums[first] == nums[first - 1]) continue;//第一层去重
            for (int second = first + 1; second < nums.length; second ++){
                if (second > first+1 && nums[second] == nums[second - 1]) continue;//第二层去重
                int L = second + 1;
                int R = nums.length - 1;
                while (L < R){
                    int sum  = nums[first] + nums[second] + nums[L] + nums[R];
                    if(sum == target) {
                        System.out.print("first="+first+" second="+second);
                        System.out.print(" L="+L+" R="+R);
                        System.out.println();
                        ans.add(Arrays.asList(nums[first],nums[second],nums[L],nums[R]));
                        while (L < R && nums[L] == nums[L + 1]) L++;
                        while (L < R && nums[R] == nums[R - 1]) R--;
                        L++;
                        R--;
                    }
                    else if (sum < target)
                        L++;
                    else
                        R--;
                }
            }
        }
        return ans;
    }
}
