import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class ScholarshipBufferedReader {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter NSAT Score: ");
        double nsatScore = Double.parseDouble(reader.readLine());

        System.out.print("Enter Parents' Monthly Salary: ");
        double salary = Double.parseDouble(reader.readLine());

        System.out.print("Enter Entrance Exam Score: ");
        double entranceScore = Double.parseDouble(reader.readLine());

        double averageExam = (nsatScore + entranceScore) / 2.0;

        // Decision Control Structure
        if (salary > 10000 || nsatScore < 90 || entranceScore < 85) {
            System.out.println("Application Status: Rejected");
        } else if (salary <= 3500 && averageExam >= 91) {
            System.out.println("Application Status: Accepted");
        } else {
            System.out.println("Application Status: For Further Study");
        }
    }
}
