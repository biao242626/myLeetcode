import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] a = new int[]{1,2,4,8,4,3};
        int[] ints = twoSum(a,8);
        for(int i : ints){
            System.out.println(i);
        }
    }
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i ++){
            if(map.containsKey(target - nums[i])){
                return new int[]{map.get(nums[target-nums[i]]),i};
            }
            map.put(nums[i],i );
        }
        throw new IllegalArgumentException("No");
    }
}
