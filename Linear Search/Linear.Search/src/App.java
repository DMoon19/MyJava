import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
    int dato, array[]={4, 2, 1, 3, 5};
    boolean flag=false;

    dato=Integer.parseInt(JOptionPane.showInputDialog("Digite el número a buscar: "));

    int i=0;
    while(i<5 && flag ==false){
        if(array[i] == dato){
            flag=true;
        }
        i++;
    }
    if(flag==false){
        JOptionPane.showMessageDialog(null, "El número no se encuentra en el arreglo");
    }else{
        JOptionPane.showMessageDialog(null, "El número ha sido encontrado en la posición: "+(i-1));
    }

    }
}
