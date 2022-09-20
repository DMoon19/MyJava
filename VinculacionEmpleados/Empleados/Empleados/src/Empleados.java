import java.util.Scanner; 
public class Empleados {
    
    static Scanner sc=new Scanner(System.in);

    public static int cedula, salario, fechaIngreso;
    public static String nombre, apellido, direccion, num, correo, fechaCumple;
    public static long celular; 

    public void consultarLiquiNomina(){

   int salarioProvisional=salario;
   salarioProvisional*=0.08;
   salario-=salarioProvisional;



    if(salario<2000000){
        System.out.println("Vive a más de 1km de su lugar de trabajo?");
        System.out.println("1.Si                                 2.No");
        byte km=sc.nextByte();
        if(km==1){
            System.out.println("Usted goza de Auxilio de Transporte");
            salario+=117172;
        }else{
            System.out.println("Usted no goza de Auxilio de Transporte");
        }
    }
    System.out.println("Salario: "+salario);
    System.out.println("Aporte Salud: "+salarioProvisional/2);
    System.out.println("Aporte Pensión: "+salarioProvisional/2);
    
    System.out.println("Prima: "+salario/2);

        
    }
    public void consultarLiquiVacaciones(){
        
        if(fechaIngreso>=48){
        System.out.println("Tiene 45 días pendientes de vacaciones remuneradas");
        }
        else  if(fechaIngreso>=36){
        System.out.println("Tiene 30 días pendientes de vacaciones remuneradas");
        }
        else  if(fechaIngreso>=24){
        System.out.println("Tiene 15 días pendientes de vacaciones remuneradas");
        }
        else if(fechaIngreso>=12){
        System.out.println("Tiene 0 días pendientes de vacaciones remuneradas");
        }else{
            System.out.print("");
        }
    }
    public void consultarDatos(){
        System.out.print("___________________________________________________________________\nNombre: "+nombre+" "
        +apellido+"\t                CC: "+cedula+
        "\nDirección: "+direccion+" "+num+"\t        Celular: "+celular+
        "\nCorreo: "+correo+"\tNacimiento: "+fechaCumple+
        "\nIngreso a la Empresa: "+fechaIngreso+"\t        Salario: "+salario+
        "\n___________________________________________________________________\n");
    }
    public void actualizarDatos(){
        System.out.print("\n--------------------------------------------");
        System.out.print("\nDigite su nombre y apellido:");
        nombre=sc.next();
        apellido=sc.next();

        System.out.print("Digite su cedula:");
        cedula=sc.nextInt();

        System.out.print("Digite su dirección:");
        direccion=sc.next();
        num=sc.next();

        System.out.print("Digite su celular:");
        celular=sc.nextLong();

        System.out.print("Digite su correo electronico:");
        correo=sc.next();

        System.out.print("Digite su fecha de nacimiento:");
        fechaCumple=sc.next();

        System.out.print("Hace cuantos meses ingresó a la empresa:");
        fechaIngreso=sc.nextInt();

        System.out.print("Digite su salario:");
        salario=sc.nextInt();
        System.out.print("--------------------------------------------\n");
        
    }

}