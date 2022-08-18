import java.util.Scanner; //Console inputs
import javax.swing.JOptionPane; //Emergent window inputs 
public class Inputs {
 
	static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

       
        //Scanner Methods

        System.out.print("Hello, World!\n ~Write down your name~");
        String str_Name=sc.nextLine();
        System.out.println("Which Language are'y using");
        String str_Language=sc.nextLine();

        System.out.println("Hi its "+str_Name+" and here is my first project with "+str_Language+" on my workspace outside CS");

        //Vars for JOptionsPane

        String cadena;
        int entero;
        char letra;
        double decimal;

        //JOptionPane Methods

        cadena=JOptionPane.showInputDialog("Digite su nombre: ");
        entero=Integer.parseInt(JOptionPane.showInputDialog("Digite su edad: "));
        letra=JOptionPane.showInputDialog("Digite su sexo: ").charAt(0);
        decimal=Double.parseDouble(JOptionPane.showInputDialog("Digite su promedio: "));
       
        // System.out.print("Hola "+cadena+" ¿tienes "+entero+" años? Eres "+letra+" y tu promedio es de "+decimal);
       
     JOptionPane.showMessageDialog(null, "La cadena es: "+cadena);
     JOptionPane.showMessageDialog(null, "El numero entero es: "+entero);
     JOptionPane.showMessageDialog(null, "El caracter es: "+letra);
     JOptionPane.showMessageDialog(null, "El decimal es: "+decimal);
    }
}
