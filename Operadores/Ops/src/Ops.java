
import java.util.Scanner;
public class Ops {

    Scanner sc=new Scanner(System.in);
    public static void main(String[] args) throws Exception {
    
                        //Simplificar operaciones
        int numero=10; // += x=x+y , -= x=x-y , *= x=x*y , /= x=x/y , %= x=x%y  
        numero+=5;    //numero=numero+5;
                     // x++ , x-- 
        numero++;   //numero=numero+1;
        System.out.println(numero);

        int x=5,y;

        y= ++x; //Si se usa el incremento como prefijo (++x) ambos valores serán iguales a 6
               //Si se usa como sufijo (x++) la Y será igual a X antes de su incremento y=5 x=6

        System.out.println("El valor de y es: "+y);
        System.out.println("El valor de x es: "+x);

        //Clase Math

        //Raiz Cuadrada
        double raiz=Math.sqrt(9); //x²

        System.out.println("La raiz es: "+raiz);

        //Elevar a x potencia
        double base=5, exponente =2;   
        double resultado=Math.pow(base, exponente);

        System.out.println("Elevación es: "+resultado);

        //Redondear un float                            //Redondear un double

        float Redondearf =7.89f;                         double Redondeard =4.56;      
        int resultadoRedonf=Math.round(Redondearf);      long resultadoRedond=Math.round(Redondeard);
     
        System.out.println("Redondeado float es: "+resultadoRedonf);
        System.out.println("Redondeado double es: "+resultadoRedond);


        //Rnd

        double Rnd=Math.random();

        System.out.println("El random es: "+Rnd);

    }
}
