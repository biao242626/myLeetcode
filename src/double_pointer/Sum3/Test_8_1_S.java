package double_pointer.Sum3;

import java.util.List;

public class Test_8_1_S {
    public static void main(String[] args) {
        int[] a = new int[]{-1,0,1,2,-1,-4};
        List<List<Integer>> ans = new Solution().threeSum(a);
        for (int i = 0; i < ans.size();i ++){
            for (int j = 0; j < ans.get(i).size(); j ++){
                System.out.printf(" "+ ans.get(i).get(j));
            }
            System.out.println();
        }
    }
}
