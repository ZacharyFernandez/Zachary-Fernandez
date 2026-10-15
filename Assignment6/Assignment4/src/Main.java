import javax.swing.JOptionPane;

class Assignment4 {
    public static void main(String[] args) {

        double height;
        int age;
        String citizenship;
        String recommendee;

        height = Double.parseDouble(
                JOptionPane.showInputDialog("Enter height in cm:")
        );

        age = Integer.parseInt(
                JOptionPane.showInputDialog("Enter age:")
        );

        citizenship = JOptionPane.showInputDialog(
                "Enter citizenship code (C or N):"
        );

        recommendee = JOptionPane.showInputDialog(
                "Enter recommendee code (R or N):"
        );

        if (recommendee.equalsIgnoreCase("R")) {
            JOptionPane.showMessageDialog(
                    null, "ACCEPTED"
            );
        } else if (height >= 200 &&
                age >= 21 && age <= 25 &&
                citizenship.equalsIgnoreCase("C")) {
            JOptionPane.showMessageDialog(
                    null, "ACCEPTED"
            );
        } else {
            JOptionPane.showMessageDialog(
                    null, "REJECTED"
            );
        }
    }
}