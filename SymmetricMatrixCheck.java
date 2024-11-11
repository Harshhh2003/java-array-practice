public class SymmetricMatrixCheck {
    public static boolean isSymmetric(int[][] matrix) {
        int n = matrix.length;
        
        for (int i = 0; i < n; i++) {
            if (matrix[i].length != n) {
                return false;
            }
        }
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] != matrix[j][i]) {
                    return false;
                }
            }
        }
        
        return true;
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {2, 5, 6},
            {3, 6, 9}
        };

        if (isSymmetric(matrix)) {
            System.out.println("The matrix is symmetric.");
        } else {
            System.out.println("The matrix is not symmetric.");
        }
    }
}
