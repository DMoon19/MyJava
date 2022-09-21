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
    public void ingresarDatos(){
        
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
    public void consultarDatos(){       
        System.out.println("___________________________________________________________________");
        System.out.print("\nNombre: "+nombre+" "+apellido+"\t                CC: "+cedula);
        System.out.print("\nDirección: "+direccion+" "+num+"\t        Celular: "+celular);
        System.out.print("\nCorreo: "+correo+"\tNacimiento: "+fechaCumple);
        System.out.print("\nIngreso a la Empresa: "+fechaIngreso+"\t        Salario: "+salario);
        System.out.println("\n___________________________________________________________________");
    }
    public void actualizarDatos(){
        System.out.println("Qué desea editar?");
        System.out.println("1. Nombre y Apellido");
        System.out.println("2. Cedula");
        System.out.println("3. Dirección");
        System.out.println("4. Celular");
        System.out.println("5. Correo");
        System.out.println("6. Nacimiento");
        System.out.println("7. Ingreso a la Empresa");
        System.out.println("8. Salario");
        byte edit=sc.nextByte();
        if(edit==1){
            System.out.println("Ingrese Nombre y Apellido: ");
            nombre=sc.next(); apellido=sc.next();
        }
        else if(edit==2){
            System.out.println("Ingrese Cedula: ");
            cedula=sc.nextInt();
        }
        else if(edit==3){
            System.out.println("Ingrese Dirección: ");
            direccion=sc.next(); num=sc.next();
        }
        else if(edit==4){
            System.out.println("Ingrese Celular: ");
            celular=sc.nextLong();
        }
        else if(edit==5){
            System.out.println("Ingrese Correo: ");
            correo=sc.next();
        }
        else if(edit==6){
            System.out.println("Ingrese Fecha de Nacimiento: ");
            fechaCumple=sc.next();
        }
        else if(edit==7){
            System.out.println("Cuantos meses lleva en la Empresa?");
            fechaIngreso=sc.nextInt();
        }
        else if(edit==8){
            System.out.println("Ingrese Salario");
            salario=sc.nextInt();
        }
        else{
            System.out.println("Error");
        }
    }

}