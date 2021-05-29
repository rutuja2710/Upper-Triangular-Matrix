import java.util.*;

public class UpperTriangularMatrix {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int rowSize = scanner.nextInt();
        int columnSize = scanner.nextInt();
        if (rowSize != columnSize) {
            System.out.println("Not a square matrix!");
            System.exit(0);
        }
        else {
            int[][] inputMatrix = new int[rowSize][columnSize];
            for (int i = 0; i < rowSize; i++) {
                for (int j = 0; j < columnSize; j++) {
                    inputMatrix[i][j] = scanner.nextInt();
                    if(i>j && inputMatrix[i][j]!=0) {
                        System.out.println("no");
                        System.exit(0);
                    }
                }
            }
            System.out.println("yes");
        }
    }
}
