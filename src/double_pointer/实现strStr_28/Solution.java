package double_pointer.实现strStr_28;

public class Solution {
    public int strStr(String haystack, String needle) {
        if(needle .equals("") )
            return 0;
        char[] a = haystack.toCharArray();
        char[] b = needle.toCharArray();
        int i = 0;
        int j = 0;
        for(i = 0; i < a.length; i ++){
            if(a[i] == b[0]){
                j = 0;
                while ( j < b.length && i + j < a.length && b[j] == a[i + j]) j ++;
                if(j >= b.length)
                    return i;
                else if(i + j >= a.length)
                    return -1;
            }
        }
        return -1;
    }
}
