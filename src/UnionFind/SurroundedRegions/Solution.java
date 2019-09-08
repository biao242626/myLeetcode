package UnionFind.SurroundedRegions;
/*
给定一个二维的矩阵，包含 'X' 和 'O'（字母 O）。
找到所有被 'X' 围绕的区域，并将这些区域里所有的 'O' 用 'X' 填充。
使用深度搜索dfs
 */
public class Solution {
    public void solve(char[][] board) {
        if(board.length == 0 || board == null)
            return;
        int m = board.length;
        int n = board[0].length;
        for(int i = 0; i < m; i ++){
            for(int j = 0; j < n; j ++){
                if((i == 0 || j == 0 || i == m - 1 || j == n-1) && board[i][j] == 'O')
                    dfs(board, i, j);
            }
        }
        for (int i = 0; i < m; i ++){
            for( int j = 0; j < n; j ++){
                if( board[i][j] == '#')
                    board[i][j] = 'O';
                else if (board[i][j] == 'O')
                    board[i][j] = 'X';
            }
        }
    }
    public void dfs(char[][] board,int i, int j){
        if(i < 0 || j < 0 || i >= board.length || j >= board[0].length || board[i][j] == 'X' || board[i][j] == '#')
            return;
        board[i][j] = '#';
        dfs(board, i-1, j);
        dfs(board, i+1, j);
        dfs(board, i, j-1);
        dfs(board, i, j+1);
    }
}
