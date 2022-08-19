import javax.swing.JOptionPane;

public class Ternario {
    
    static JOptionPane jo=new JOptionPane(System.in);
    public static void main(String[] args) throws Exception {
       
       int numero;
       String mensaje;

       numero=Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
    
       mensaje=(numero%2==0) ? "es Par" : "es Imgpar";

       JOptionPane.showMessageDialog(null, mensaje);
    }
}
