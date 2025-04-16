public class Main {
    public static void main(String[] args) {
        char [][] rows = {
                {'.', '.', '.'},
                {'.', '.', '.'},
                {'.', '.', '.'},
        };
        rows [1][1] = 'X';
        //System.out.println(rows);
        for (int r = 0; r < rows.length; r++) {
            for (int c = 0; r < rows[r].length; c++) {
                System.out.print(rows[r][c]);
                System.out.print(' ');
            }

            System.out.print("\n");
        }
    }
}