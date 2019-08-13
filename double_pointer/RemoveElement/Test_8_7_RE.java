package double_pointer.RemoveElement;

public class Test_8_7_RE {
    public static void main(String[] args) {
        int[] a = new int[]{3,2,2,3};
        Solution solution = new Solution();
        int result = solution.removeElement(a, 3);
        System.out.println("result =" + result);
        for(int i : a)
            System.out.printf(" " + i);
    }
}
