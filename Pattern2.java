public class Pattern2 {
    public static void main(String[] args) {
        // Declare a 2D array 'a' with dimensions 5x5
        int[][] a = new int[5][5];
        
        // Declare variables i and j for controlling the loops
        int i, j;
        
        // Outer loop to iterate through rows of the array (5 rows in total)
        for(i = 0; i < a.length; i++) {
            // Inner loop to iterate through columns of each row (5 columns in total)
            for(j = 0; j < a[i].length; j++) {
                // Check if the column index 'j' is odd
                if(j % 2 == 1) {
                    // If the column is odd, print "#" followed by a space
                    System.out.print("# ");
                }
                // If the row index 'i' is even (i.e., 0, 2, 4), print "*" in even columns
                else if(i % 2 == 0) {
                    System.out.print("* ");
                }
                // Otherwise, for odd rows, print "#" in even columns
                else {
                    System.out.print("# ");
                }
            }
            // Move to the next line after finishing one row
            System.out.println();
        }
    }
}
