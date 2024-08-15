
public class MovieTheater {

    private final char[][] seats;
    private final int rows;
    private final int columns;

    public MovieTheater(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        seats = new char[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                seats[i][j] = '0';
            }
        }
    }

    public void displaySeatingChart() {
        System.out.println("Seating Chart:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(seats[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void reserveSeat(int row, int col) {
        if (row < 0 || row >= rows || col < 0 || col >= columns) {
            System.out.println("Invalid seat number.");
            return;
        }

        if (seats[row][col] == 'X') {
            System.out.println("Seat is already taken.");
        } else {
            seats[row][col] = 'X';
            System.out.println("Seat reserved successfully.");
        }
    }
}
