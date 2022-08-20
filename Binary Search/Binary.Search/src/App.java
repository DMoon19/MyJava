import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        int dato, inf, sup, mitad, array[]={1, 2, 3, 4, 5};
        boolean flag=false;
    
        dato=Integer.parseInt(JOptionPane.showInputDialog("Digite el número a buscar: "));
       
        sup=5;
        inf=0;
        int i=0;

        mitad=(inf+sup)/2;

        while(inf<sup && i<5){
            if(array[mitad] == dato){
                flag=true;
                break;
            }
            else if(array[mitad] > dato){
                sup=mitad;
                mitad=(inf+sup)/2;
            }
            else if(array[mitad] < dato){
                inf=mitad;
                mitad=(inf+sup)/2;
            }
            i++;
        }
        if(flag==true){
            JOptionPane.showMessageDialog(null, "El número ha sido encontrado en la posición: "+mitad);
        }
        else{
            JOptionPane.showMessageDialog(null, "No hemos encontrado el número en el arreglo");
        }
    }
}
