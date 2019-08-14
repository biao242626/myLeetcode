package double_pointer.sortColors;

/*
给定一个包含红色、白色和蓝色，一共 n 个元素的数组，原地对它们进行排序，使得相同颜色的元素相邻，并按照红色、白色、蓝色顺序排列。

此题中，我们使用整数 0、 1 和 2 分别表示红色、白色和蓝色。
 */
public class Solution {
    public void sortColors(int[] nums) {
        int p0 = 0;
        int p2 = nums.length - 1;
        int cur = 0;
        while (cur <= p2){
            switch (nums[cur]){
                case 0:
                    //cur和p0交换
                    swap(nums,cur,p0);
                    p0++;
                    cur++;
                    break;
                case 1:
                    cur++;
                    break;
                case 2:
                    swap(nums,cur ,p2 );
                    p2--;
                    break;
                default:
                    break;
            }
        }
    }

    public void swap(int[] nums, int a, int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}
