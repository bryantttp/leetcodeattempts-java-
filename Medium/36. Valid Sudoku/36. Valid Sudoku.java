// 130324 Submission
class Solution {
    public boolean isValidSudoku(char[][] board) {

        // Approach
        // 1) Create a hashset to store details of where the number has been seen
        // 2) Nested loop to loop through all parts of the 9x9 sudoku board
        // 3) In the nested loop, create a temp variable to store the char value that is in the particular iteration
        // 4) If it is not equal to '.', check if it can be added to the hashset. If it is not able to be added, return false
        // 5) AFter the nested loop, return true to show that the sudoku is valid

        Set details = new HashSet();

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++){
                char num = board[i][j];
                if (num != '.'){
                    if (!details.add(num + " in row " + i) || !details.add(num + " in column " + j) || !details.add(num + " in 3x3 grid of " + i/3 + "x" + j/3)){
                        return false;
                    }
                }
            }
        }
        return true;

        // Runtime = 14ms, beats 22.91% of users
        // Memory = 44.72MB, beats 30.96% of users
    }
}
