
public class LC_2133 {

    public boolean checkValid(int[][] matrix) {
        int n = matrix.length;

        for (int i = 0; i < n; i++) {
            boolean[] rowCheck = new boolean[n + 1];
            boolean[] colCheck = new boolean[n + 1];
            for (int j = 0; j < n; j++) {
                if (rowCheck[matrix[i][j]] || colCheck[matrix[j][i]]) {
                    return false;
                }
                rowCheck[matrix[i][j]] = true;
                colCheck[matrix[j][i]] = true;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        LC_2133 lc = new LC_2133();
        int[][] example1 = {{1, 2, 3}, {3, 1, 2}, {2, 3, 1}};

        boolean result = lc.checkValid(example1);
        System.out.println("Result: " + result);
    }
}
