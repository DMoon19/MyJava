package ClasesYObjetos;

public class Coche {
    
    //Atributos
    String color, marca;
    int km;
    
    //Método

    public static void main(String [] args){
        Coche CX30=new Coche();

        CX30.color="Blanco";
        CX30.marca="Mazda";
        CX30.km=0;

        System.out.print("\nEl color del CX-30 es: "+CX30.color+"\nLa marca del CX-30 es: "+CX30.marca+"\nEl kilometraje del CX-30 es: "+CX30.km);

        System.out.println("");

        Coche A7=new Coche();

        A7.color="Rojo";
        A7.marca="Audi";
        A7.km=200;

        System.out.print("\nEl color del A7 es: "+A7.color+"\nLa marca del A7 es: "+A7.marca+"\nEl kilometraje del A7 es: "+A7.km);
    }
}
