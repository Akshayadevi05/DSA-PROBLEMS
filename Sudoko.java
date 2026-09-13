class Sudoko {
    public boolean isValidSudoku(char[][] board) {

        // Check rows and columns
        for (int i = 0; i < 9; i++) {

            boolean[] row = new boolean[9];
            boolean[] col = new boolean[9];

            for (int j = 0; j < 9; j++) {

                // Check row
                if (board[i][j] != '.') {
                    int num = board[i][j] - '1';

                    if (row[num]) {
                        return false;
                    }

                    row[num] = true;
                }

                // Check column
                if (board[j][i] != '.') {
                    int num = board[j][i] - '1';

                    if (col[num]) {
                        return false;
                    }

                    col[num] = true;
                }
            }
        }

        // Check 3 x 3 boxes
        for (int row = 0; row < 9; row += 3) {
            for (int col = 0; col < 9; col += 3) {

                boolean[] box = new boolean[9];

                for (int i = row; i < row + 3; i++) {
                    for (int j = col; j < col + 3; j++) {

                        if (board[i][j] != '.') {
                            int num = board[i][j] - '1';

                            if (box[num]) {
                                return false;
                            }

                            box[num] = true;
                        }
                    }
                }
            }
        }

        return true;
    }
}