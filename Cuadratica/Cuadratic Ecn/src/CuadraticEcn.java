import java.util.Scanner;

public class CuadraticEcn {

    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        

        double X1,X2, a,b,c;

        System.out.println("\n-Calcule la cuadratica");
        System.out.println("Ingrese a, b y c: ");
         a=sc.nextDouble();
         b=sc.nextDouble();
         c=sc.nextDouble();

        X1=(-b +Math.sqrt(Math.pow(b, 2) - (4*a*c))) / (2*a); 
        X2=(-b -Math.sqrt(Math.pow(b, 2) - (4*a*c))) / (2*a); 

        System.out.println("X1:"+X1);
        System.out.println("X2:"+X2);
    }
}
