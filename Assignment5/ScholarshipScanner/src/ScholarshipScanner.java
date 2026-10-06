import java.util.Scanner;

ScholarshipScanner class ScholarshipScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter NSAT Score: ");
        double nsatScore = scanner.nextDouble();

        System.out.print("Enter Parents' Monthly Salary: ");
        double salary = scanner.nextDouble();

        System.out.print("Enter Entrance Exam Score: ");
        double entranceScore = scanner.nextDouble();

        double averageExam = (nsatScore + entranceScore) / 2.0;

        // Decision Control Structure
        if (salary > 10000 || nsatScore < 90 || entranceScore < 85) {
            System.out.println("Application Status: Rejected");
        } else if (salary <= 3500 && averageExam >= 91) {
            System.out.println("Application Status: Accepted");
        } else {
            System.out.println("Application Status: For Further Study");
        }

        scanner.close();
    }
}
