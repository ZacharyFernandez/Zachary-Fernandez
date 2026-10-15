import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Assignment4 {
    public static void main(String[] args) throws IOException {

        BufferedReader input = new BufferedReader(
                new InputStreamReader(System.in)
        );

        System.out.print("Enter height in cm: ");
        double height = Double.parseDouble(input.readLine());

        System.out.print("Enter age: ");
        int age = Integer.parseInt(input.readLine());

        System.out.print("Enter citizenship code (C/N): ");
        String citizenship = input.readLine();

        System.out.print("Enter recommendee code (R/N): ");
        String recommendee = input.readLine();

        if (recommendee.equalsIgnoreCase("R")) {
            System.out.println("ACCEPTED");
        } else if (height >= 200 && age >= 21 && age <= 25
                && citizenship.equalsIgnoreCase("C")) {
            System.out.println("ACCEPTED");
        } else {
            System.out.println("REJECTED");
        }
    }
}