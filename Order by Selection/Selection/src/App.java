import java.util.NoSuchElementException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class App {

    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) throws Exception {

        int array[], nElements, min, aux;

        nElements=Integer.parseInt(JOptionPane.showInputDialog("Digite el número de elementos del arreglo:"));

        array=new int [nElements];

        System.out.println("Digite el arreglo: ");

        for(int i=0;i<nElements;i++){
            System.out.println((i+1)+". Digite un número: ");
            array[i]=sc.nextInt();
        }

        //Ordenamiento por Selección

        for(int i=0;i<nElements;i++){
            min=i;
            for(int j=i+1;j<nElements;j++){

                if(array[j] < array[min]){
                    min=j;
                }
            }
            aux=array[i];
            array[i]=array[min];
            array[min]=aux;
        }
         //Output Array

         System.out.print("\nOrden Ascendente: ");
         for(int i = 0;i<nElements;i++){
             
             System.out.print(array[i]+" - ");
         }
         System.out.print("");
 
         System.out.print("\nOrden Descendente: ");
         for(int i = (nElements)-1;i>=0;i--){
            
             System.out.print(array[i]+" - ");
         }
    }
}
