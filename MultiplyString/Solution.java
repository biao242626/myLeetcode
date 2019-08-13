package MultiplyString;

public class Solution {
    public String multiply(String num1, String num2) {
        if(num1.equals("0")  || num2.equals("0"))
            return new String("0");
        int array[][] = new int[num2.length()][num1.length()+num2.length()];//用于存储
        char a[] = num1.toCharArray();
        char b[] = num2.toCharArray();
        for(int i = 0; i < num2.length(); i ++){
            array[i][0] = 0;
            for(int j = 0; j< num1.length(); j++){
                array[i][j+i+1] = (b[i] - '0')*(a[j] - '0');
            }
        }
        int jinwei = 0;
        int[] result = new int[num1.length()+num2.length()];
        for (int j = array[0].length-1; j >= 0; j --){
            int temp = jinwei;
            for(int i = 0; i < array.length; i++){
                temp += array[i][j];
            }
            result[j] = temp % 10;
            //System.out.println("result"+temp%10);
            jinwei = temp / 10;
        }
        StringBuilder stringBuilder = new StringBuilder();
        if(result[0] != 0)
            stringBuilder.append(result[0]);
        for(int w = 1; w < result.length; w ++){
            stringBuilder.append(result[w]);
        }
        return  new String(stringBuilder);
    }
}
