import javax.swing.JOptionPane;

public class PrincipalIf {
    public static void main(String[] args) {
        int numif, dato1 = 5;
        numif = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        if (numif == dato1) {
            JOptionPane.showMessageDialog(null, "El numero es 5.");
        } else if (numif < dato1) {
            JOptionPane.showMessageDialog(null, "El numero es menor que 5.");
        } else {
            JOptionPane.showMessageDialog(null, "El numero es mayor que 5.");
        }

    }
    
}
