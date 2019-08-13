package double_pointer.sum4;

import java.util.List;

public class Test_8_2_S {
    public static void main(String[] args) {
        int[] a = new int[]{-10,-9,-9,-7,-4,-2,-2,-2,2,4,4,4,5,5,5,9,9,10};
        List<List<Integer>> ans = new Solution().fourSum(a, -13);
        for(int i = 0; i < ans.size(); i ++){
            for (int j = 0; j < ans.get(i).size();j ++)
                System.out.printf(" "+ans.get(i).get(j));
            System.out.println();
        }
    }
}
