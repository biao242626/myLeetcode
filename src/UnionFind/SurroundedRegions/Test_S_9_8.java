package UnionFind.SurroundedRegions;

public class Test_S_9_8 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        char[][] a = new char[][]{
                {'X','O','X','X','X'},
                {'X','O','O','X','X'},
                {'X','X','X','O','X'},
                {'X','X','O','X','O'},
                {'X','X','X','X','X'}
        };
        solution.solve(a);
        for(int i = 0; i < a.length; i ++){
            for(int j = 0; j < a[0].length; j ++)
                System.out.printf(" "+ a[i][j]);
            System.out.println();
        }
    }
}
