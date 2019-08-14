public class ReverseInteger {
    public static void main(String[] args) {
        System.out.println(reverse(-123));
    }
    public static int reverse(int x) {
        int x_rev = 0;
        while (x != 0){
            int temp = x % 10;
            x = x/10;
            if(x_rev > Integer.MAX_VALUE/10 || (x_rev == Integer.MAX_VALUE/10 && temp > 7))
                return 0;
            if (x_rev < Integer.MIN_VALUE/10 || (x_rev == Integer.MIN_VALUE/10 && temp < -8))
                return 0;
            x_rev = x_rev * 10 + temp;
        }
        return x_rev;
    }
}
