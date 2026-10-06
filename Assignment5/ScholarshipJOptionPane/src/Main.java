import javax.swing.JOptionPane;

class ScholarshipJOptionPane {
    public static void main(String[] args) {
        String nsatInput = JOptionPane.showInputDialog("Enter NSAT Score:");
        double nsatScore = Double.parseDouble(nsatInput);

        String salaryInput = JOptionPane.showInputDialog("Enter Parents' Monthly Salary:");
        double salary = Double.parseDouble(salaryInput);

        String entranceInput = JOptionPane.showInputDialog("Enter Entrance Exam Score:");
        double entranceScore = Double.parseDouble(entranceInput);

        double averageExam = (nsatScore + entranceScore) / 2.0;

        String result;
        // Decision Control Structure
        if (salary > 10000 || nsatScore < 90 || entranceScore < 85) {
            result = "Application Status: Rejected";
        } else if (salary <= 3500 && averageExam >= 91) {
            result = "Application Status: Accepted";
        } else {
            result = "Application Status: For Further Study";
        }

        JOptionPane.showMessageDialog(null, result);
    }
}