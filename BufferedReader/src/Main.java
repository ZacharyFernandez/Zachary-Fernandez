import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));

        int number;
        int highest = Integer.MIN_VALUE;
        int lowest = Integer.MAX_VALUE;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Enter number " + i + ": ");
            number = Integer.parseInt(br.readLine());

            if (number > highest) {
                highest = number;
            }

            if (number < lowest) {
                lowest = number;
            }
        }

        System.out.println("Highest number: " + highest);
        System.out.println("Lowest number: " + lowest);
    }
}