import java.util.Scanner;
public class Program{
       
       static Empleados emp=new Empleados();
      
       static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {

        byte Empleado;
        System.out.println("________________________________________");
        System.out.println("|            TIPO EMPLEADO             |");
        System.out.println("|______________________________________|");                         
        System.out.println("|1. Ingresar como Administrativo       |");
        System.out.println("|2. Ingresar como Operario Técnico     |");
        System.out.println("|3. Ingresar como Operario No Técnico  |");                        
        System.out.println("|______________________________________|\n");
        Empleado=sc.nextByte();
    
         //Menú Administrativos
         if(Empleado==1){
            Administrativos adm=new Administrativos();
            adm.ingresarDatos();
            byte opcion;
            do{
            System.out.println("____________________________________");
            System.out.println("|------------MENU ADMON------------|");
            System.out.println("| 1. Datos Personales              |");
            System.out.println("| 2. Generar Informe de Planta     |");
            System.out.println("| 3. Títulos Profesionales         |");
            System.out.println("| 4. Liquidación Vacaciones        |"); 
            System.out.println("| 5. Liquidación de Nomina         |");
            System.out.println("| 0. Salir                         |");
            System.out.println("|__________________________________|");
            System.out.println(" Ingrese una opcion: ");
            opcion = sc.nextByte();
            switch (opcion){
               case 1:
            adm.consultarDatos();
            System.out.println("Desea actualizar los datos?");
            System.out.println("1.Si                   2.No");
            int actuali=sc.nextInt();
               if(actuali==1){
                  
               adm.actualizarDatos();
               }             
                  break;
               case 2:
                  //Generar Informe
                  break;
               case 3:
                 adm.consultarTitulos();
                  System.out.println("Desea actualizar los Títulos Profesionales?");
                  System.out.println("1.Si                                   2.No");
                  actuali=sc.nextInt();
                  if(actuali==1){
                  adm.actualizarTitulos();
                  }
                  break;
               case 4:
                 adm.consultarLiquiVacaciones();
                  break;
               case 5:
                 adm.consultarLiquiNomina();
                  break;
            }
         }while (opcion!=0);
      }
         
        //Menú Operativos Tec
         else if(Empleado==2){ 
            Operativos op=new Operativos(); 
            op.ingresarDatos();
            op.ActualizarCursos();
            byte opcion;
            do{
            System.out.println("_____________________________________");
            System.out.println("|---------MENU OPERARIO TEC---------|");
            System.out.println("| 1. Datos Personales               |");
            System.out.println("| 2. Cursos Realizados              |");
            System.out.println("| 3. Descripción de Labores         |");
            System.out.println("| 4. Liquidación Vacaciones         |"); 
            System.out.println("| 5. Liquidación de Nomina          |");
            System.out.println("| 0. Salir                          |");
            System.out.println("|___________________________________|");
            System.out.println(" Ingrese una opcion: ");
            opcion = sc.nextByte();
            switch (opcion){
               case 1:
               emp.consultarDatos();
               System.out.println("Desea actualizar los datos?");
               System.out.println("1.Si                   2.No");
               int actuali=sc.nextInt();
                  if(actuali==1){
                  emp.actualizarDatos();
                  }             
                     break;
               case 2:
                 op.consultarCursos();
                 System.out.println("\nDesea actualizar los Cursos Realizados?");
                 System.out.println("1.Si                               2.No");
                 actuali=sc.nextInt();
                 if(actuali==1){
                 op.ActualizarCursos();
                 }
                  break;
               case 3:
                 //Labores xd
                   break;
               case 4:
               emp.consultarLiquiVacaciones();
                  break;
               case 5:
               emp.consultarLiquiNomina();
            }
         }while (opcion!=0);
      } 

      //Menú Operativos No Tec
      else if(Empleado==3){ 
         Operativos op=new Operativos(); 
         op.ingresarDatos();
         op.ActualizarCursos();
         byte opcion;
         do{
         System.out.println("______________________________________");
         System.out.println("|--------MENU OPERARIO NO TEC--------|");
         System.out.println("| 1. Cursos Realizados               |");
         System.out.println("| 2. Descripción de Labores          |");
         System.out.println("| 3. Liquidación Vacaciones          |"); 
         System.out.println("| 4. Liquidación de Nomina           |");
         System.out.println("| 0. Salir                           |");
         System.out.println("|____________________________________|");
         System.out.println(" Ingrese una opcion: ");
         opcion = sc.nextByte();
         switch (opcion){
            case 1:
                 op.consultarCursos();
                 System.out.println("Desea actualizar los Cursos Realizados?");
                 System.out.println("1.Si                               2.No");
                 int actuali=sc.nextInt();
                 if(actuali==1){
                 op.ActualizarCursos();
                 }
                  break;
            case 2:
               //Descripcion de labores
               break;
            case 3:
              emp.consultarLiquiVacaciones();
               break;
            case 4:
             emp.consultarLiquiNomina();
               break;   
         }
      }while (opcion!=0);
   }   
   }
}
   

