package Patterns;

public class Rhombus {
    public static void main(String[] args) {
        int n= 5;
        for (int i = 0; i < 2 *n ; i++) {
            int totalColsInRow = i > n ? 2 * n-i : i;
            int noOfSpaces = n - totalColsInRow;
            for (int j = 0; j < noOfSpaces; j++) {
                System.out.print(" ");

            }
            for (int col = 0; col < totalColsInRow; col++) {
                System.out.print("* ");

            }
            System.out.println();

        }
    }
}
