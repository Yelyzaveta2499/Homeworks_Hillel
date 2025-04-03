import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();

        int columns = 4;
        int rows = 4;
        int[][] matrix = new int[rows][columns];

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < columns; c++) {
                int randomNumber = random.nextInt(100) + 1;
                matrix[r][c] = 1;
                System.out.print(matrix[r][c] + " ");
            }
            System.out.println();
        }

        int sumEvenRow = 0;
        int sumOddRow = 0;

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < columns; c++) {
                if (r %  2 == 0){
                    sumEvenRow += matrix[r][c];
                }
                else {
                    sumOddRow += matrix[r][c];
                }
            }
        }

        System.out.printf("Sum of even rows: %d\n", sumEvenRow);
        System.out.printf("Sum of odd rows: %d\n", sumOddRow);

        int productEvenColumns = 1;
        int productOddColumns = 1;

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < columns; c++) {
                if (c % 2 == 0) {
                    productEvenColumns *= matrix[r][c];
                } else {
                    productOddColumns *= matrix[r][c];
                }
            }
        }

        System.out.printf("Product of even columns: %d\n", productEvenColumns);
        System.out.printf("Product of odd columns: %d\n", productOddColumns);

        int goldenSum = 0;
        for (int i = 0; i < rows; i++) {
            goldenSum += matrix[0][i];
        }

        boolean isMagic = true;
        for (int i = 0; i < rows; i++) {
            int rowSum = 0, colSum = 0;
            for (int j = 0; j < columns; j++) {
                rowSum += matrix[i][j];
                colSum += matrix[j][i];
            }
            if (rowSum != goldenSum || colSum != goldenSum) {
                isMagic = false;
                break;
            }
        }

        // Check diagonals
        int diagSum1 = 0, diagSum2 = 0;
        for (int i = 0; i < rows; i++) {
            diagSum1 += matrix[i][i];
            diagSum2 += matrix[i][rows - 1 - i];
        }
        if (diagSum1 != goldenSum || diagSum2 != goldenSum) {
            isMagic = false;
        }

        if (isMagic == true){
            System.out.println("The matrix is magic");
        } else {
            System.out.println("The matrix is not magic");
        }

    }
}