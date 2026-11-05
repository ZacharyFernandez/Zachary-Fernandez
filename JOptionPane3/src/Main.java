import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {

        double balance = 20000;
        double amount;

        while (true) {
            amount = Double.parseDouble(
                    JOptionPane.showInputDialog(
                            "Enter amount (0 to stop):"));

            if (amount == 0) {
                break;
            }

            if (amount > 0) {
                balance += amount;

                JOptionPane.showMessageDialog(null,
                        "Deposit successful!");
            } else {
                if (Math.abs(amount) > balance) {
                    JOptionPane.showMessageDialog(null,
                            "INSUFFICIENT FUNDS!");
                } else {
                    balance += amount;

                    JOptionPane.showMessageDialog(null,
                            "Withdrawal successful!");
                }
            }

            JOptionPane.showMessageDialog(null,
                    String.format("Outstanding Balance: ₱%.2f", balance));
        }

        JOptionPane.showMessageDialog(null,
                String.format("Final Balance: ₱%.2f", balance));
    }
}