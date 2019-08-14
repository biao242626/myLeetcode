package ZigZagConversion;

public class Solution {
    public String convert(String s, int numRows) {
        if(numRows == 1)
            return s;
        int count = Math.min(numRows,s.length() );
        int loc = 0;
        StringBuilder[] rows = new StringBuilder[count];
        for(int i = 0; i < count; i ++)
            rows[i] = new StringBuilder();
        boolean down = false;
        for(int i = 0; i < s.length(); i ++){
            rows[loc].append(s.charAt(i));
            if(loc == 0|| loc == numRows - 1){
                down = !down;
            }
            loc += down? 1:-1;
        }
        String ss = "";
        for (int j = 0; j < count; j ++)
            ss += rows[j];
        return ss;
    }
}
