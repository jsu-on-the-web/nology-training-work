public class ArraysContinued {
    public static void main(String[] args) {
        // * Multi dimensional arrays

        int[][] grid = { { 1, 2 }, { 3, 4 } };

        System.out.println("Nested for-loop");
        // We can try iterating through it with a nested for-loop
        for (int i = 0; i < grid.length; i++) {
            // This inner for-loop loops through the inner arrays
            int[] row = grid[i];
            for (int j = 0; j < row.length; j++) {
                System.out.printf("The value is %d %n", row[j]);
            }
        }
        
    }
}
