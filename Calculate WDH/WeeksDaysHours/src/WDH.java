import java.util.Scanner;

public class WDH {

    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) throws Exception {
    
  

        int H, w,d,h;

        System.out.println("Digite el número de horas: ");
        H=sc.nextInt();

        w=H/168;
        d=H%168/24;
        h=H%24;

        System.out.println("\n-El equivalente es: ");
        System.out.println("semanas: "+w);
        System.out.println("días: "+d);
        System.out.println("horas: "+h);
    }
}
