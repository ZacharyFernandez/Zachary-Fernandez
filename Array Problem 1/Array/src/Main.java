import java.util.Arrays; // Ini-import ang Arrays para magamit ang deepToString().

public class Main { // Gumagawa ng class na Main.

    public static void main(String[] args) { // Main method kung saan magsisimula ang program.

        // Nagde-declare at nag-i-initialize ng 2D String array na pinangalanang seats.S
        String[][] seats = {
                {"Alice", "Bob", "Charlie"}, // Unang row na may tatlong upuan.
                {"David", "Emma", "Frank"}   // Pangalawang row na may tatlong upuan.
        };

        // Kinukuha at ipinapakita ang taong nasa second row at third column.
        System.out.println("Second row, third column: " + seats[1][2]);

        // Pinapalitan ang pangalan na Bob ng Vacant.
        seats[0][1] = "Vacant";

        // Ipinapakita ang buong seating arrangement gamit ang deepToString().
        System.out.println("Updated seating arrangement: " + Arrays.deepToString(seats));

    } // Katapusan ng main method.

} // Katapusan ng Main class.