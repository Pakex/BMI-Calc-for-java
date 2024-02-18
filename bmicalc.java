import javax.swing.JOptionPane;

public class bmicalc {
    public static void main(String[] args) {
        String weight = JOptionPane.showInputDialog(null,"Enter weight: ");
        String height = JOptionPane.showInputDialog(null,"Enter height meters: ");

        double weight1 = Double.parseDouble(weight);
        double height1 = Double.parseDouble(height);

        double height2x = height1 * height1;
        double bmi = weight1 / height2x;

        if(bmi < 18.5){
            JOptionPane.showMessageDialog(null,"Underweight");
        }else if(bmi < 25.5){
            JOptionPane.showMessageDialog(null,"Health");
        }
        JOptionPane.showMessageDialog(null,"your bmi is: "+bmi);
    }
}
