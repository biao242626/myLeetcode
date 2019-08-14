package double_pointer.sortColors;

public class Test_8_14_S {
    public static void main(String[] args) {
        int[] a = new int[]{2,0,2,1,1,0};
        Solution solution = new Solution();
        solution.sortColors(a);
        for (int i : a)
            System.out.printf(" "+i);
    }
}
