package double_pointer.ContainerWithMostWater;

public class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int max = Math.min(height[0],height[right] ) * right;
        while (left != right){
            if (height[left] < height[right])
                left ++;
            else
                right --;
            if(Math.min(height[left],height[right] ) * (right - left) > max)
                max = Math.min(height[left],height[right] ) * (right - left);
        }
        return max;
    }
}
