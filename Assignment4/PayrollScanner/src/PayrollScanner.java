import java.util.Scanner;

class PayrollScanner{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter hourly pay rate: ");
        double payRate = scanner.nextDouble();

        System.out.print("Enter hours worked: ");
        double hoursWorked = scanner.nextDouble();

        double grossPay = payRate * hoursWorked;
        double taxRate;

        if (grossPay <= 2000.00) {
            taxRate = 0.10;
        }else if (grossPay <= 4000.00) {
            taxRate = 0.12;
        }else if (grossPay <= 10000.00) {
            taxRate = 0.15;
        }else {
            taxRate = 0.20;
        }

        double withholdingTax = grossPay * taxRate;
        double netPay = grossPay - withholdingTax;

        System.out.printf("\n--- Payroll Summary ---\n");
        System.out.printf("Gross Pay: Php %2f\n", grossPay);
        System.out.printf("Withholding Tax (%.0f%%): Php %.2f\n", taxRate * 100, withholdingTax);
        System.out.printf("Net Pay: %.2f\n", netPay);

        scanner.close();

    }

}