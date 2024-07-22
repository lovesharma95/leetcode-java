
public class LC_52 {

    public int totalNQueens(int n) {
        int[] ans = new int[1];
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }
        helper(ans, board, n, 0);
        return ans[0];
    }

    private void helper(int[] ans, char[][] board, int n, int col) {
        if (col == n) {
            ans[0] += 1;
            return;
        }

        for (int row = 0; row < n; row++) {
            if (isValid(board, row, col, n)) {
                board[row][col] = 'Q';
                helper(ans, board, n, col + 1);
                board[row][col] = '.';
            }
        }
    }

    private boolean isValid(char[][] board, int row, int col, int n) {
        // Check the left side of the current row
        for (int i = 0; i < col; i++) {
            if (board[row][i] == 'Q') {
                return false;
            }
        }

        // Check the upper diagonal on the left side
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        // Check the lower diagonal on the left side
        for (int i = row, j = col; i < n && j >= 0; i++, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        LC_52 lc = new LC_52();

        System.out.println("Result: " + lc.totalNQueens(4));
    }
}
