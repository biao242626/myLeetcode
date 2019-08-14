package NextPermutation;

public class Test_7_30_N {
    public static void main(String[] args) {
        int[] a = new int[]{1,3};
        Solution solution = new Solution();
        solution.nextPermutation(a);
        for (int i : a)
            System.out.print(i+" ");
    }
}
