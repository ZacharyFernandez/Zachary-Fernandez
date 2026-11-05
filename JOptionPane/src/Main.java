import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {

        int number;
        int highest = Integer.MIN_VALUE;
        int lowest = Integer.MAX_VALUE;

        for (int i = 1; i <= 10; i++) {
            number = Integer.parseInt(2554
                    JOptionPane.showInputDialog("Enter number " + i + ":"));

            if (number > highest) {
                highest = number;
            }

            if (number < lowest) {
                lowest = number;
            }
        }

        JOptionPane.showMessageDialog(null,
                "Highest number: " + highest +
                        "\nLowest number: " + lowest);
    }
}