class arrays2D {
    public static void main(String args[]) {
        // Initializing a 2D array with 4 rows and 2 columns
        int arr[][] = {
            {1, 2},
            {2, 3},
            {4, 5},
            {6, 7}
        };

        // Iterating through the 2D array using a nested for-each loop
        for (int i=0;i<arr.length;i++) { // Iterates through each row
            for (int j = 0; j < arr[i].length; j++) { // Iterates through each element in the row
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(); // Newline after each row
        }
    }
}
