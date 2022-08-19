import java.util.Scanner;

import javax.swing.JOptionPane;

public class Bubble {

    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        
        int array[],nElements;

        nElements = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de elementos"));

        array=new int[nElements];

        for(int i=0;i < nElements;i++){
            System.out.print((i+1)+". Digite un número:");
            array[i] = sc.nextInt();
        }

        //Bubble Method

        for(int i= 0;i < (nElements-1);i++){

            for(int j = 0;j < (nElements-1);j++){
                if(array[j] > array[j+1]){ //numeroActual>numeroSiguiente
                    int aux = array[j];
                    array[j] = array[j+1];
                    array[j+1] = aux;
                }
            }
        }
        System.out.println("\nArreglo ordenado en forma creciente: ");
        for(int i=0;i<nElements;i++){
            System.out.print(array[i]+" - ");
        }

        System.out.println("\nArreglo ordenado en forma decreciente: ");
        for(int i=(nElements-1);i>=0;i--){
            System.out.print(array[i]+" - ");
        }
        System.out.print("");
        }
}