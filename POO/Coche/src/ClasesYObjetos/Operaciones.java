package ClasesYObjetos;

public class Operaciones {
    
    int suma, resta, multi, divis;

    public void sumar(int numero1,int numero2){
        suma=numero1+numero2;
    }

    public void restar(int numero1,int numero2){
        resta=numero1-numero2;
    }

    public void multiplicar(int numero1,int numero2){
        multi=numero1*numero2;
    }

    public void dividir(int numero1,int numero2){
        divis=numero1/numero2;

    }

    public void Mostrar(){

        System.out.println("La suma es: "+suma);
        System.out.println("La resta es: "+resta);
        System.out.println("La multiplicación es: "+multi);
        System.out.println("La división es: "+divis);
    }
  

}
