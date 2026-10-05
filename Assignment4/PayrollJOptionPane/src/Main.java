import javax.swing.JOptionPane;

class PayrollJOptionPane {
    public static void main(String[] args){
        String payRateInput = JOptionPane.showInputDialog("Enter hourly pay rate: ");
        double payRate = Double.parseDouble(payRateInput);

        String hoursWorkedInput = JOptionPane.showInputDialog("Enter hours worked: ");
        double hoursWorked = Double.parseDouble(hoursWorkedInput);

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

        String resultMessage = String.format("Gross Pay: Php %.2f\nWithholding Tax (%.0f%%) Php %.2f\nNet Pay: Php %.2f",
                grossPay,
                taxRate * 100,
                withholdingTax,
                netPay
        );
        JOptionPane.showMessageDialog(null, resultMessage, "Payroll Summary", JOptionPane.INFORMATION_MESSAGE);




    }
}