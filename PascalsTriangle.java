public class PascalsTriangle {
    public static void main(String[] args) {
        int rows = 5; // Number of rows in the triangle
        for (int i = 0; i < rows; i++) {
            int number = 1; // First number in each row is always 1

            // Print leading spaces for formatting
            for (int j = 0; j < rows - i - 1; j++) {
                System.out.print(" "); // To center the numbers
            }

            // Print the numbers in the current row
            for (int j = 0; j <= i; j++) {
                System.out.print(number + " ");
                number = number * (i - j) / (j + 1); // Binomial coefficient formula
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
