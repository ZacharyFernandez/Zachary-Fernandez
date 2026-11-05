import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));

        double balance = 20000;
        double amount;

        while (true) {
            System.out.print("Enter amount (0 to stop): ");
            amount = Double.parseDouble(br.readLine());

            if (amount == 0) {
                break;
            }

            if (amount > 0) {
                balance += amount;
                System.out.println("Deposit successful!");
            } else {
                if (Math.abs(amount) > balance) {
                    System.out.println("INSUFFICIENT FUNDS!");
                } else {
                    balance += amount;
                    System.out.println("Withdrawal successful!");
                }
            }

            System.out.printf("Outstanding Balance: %.2f%n", balance);
        }

        System.out.printf("Final Balance: %.2f%n", balance);
    }
}
