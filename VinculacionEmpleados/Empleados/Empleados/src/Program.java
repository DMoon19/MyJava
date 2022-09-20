import java.util.Scanner;
public class Program{
       static Operativos op=new Operativos(); 
       static Empleados emp=new Empleados();
       static Administrativos adm=new Administrativos();
       static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {

        byte Empleado;
        System.out.println("_________________________");
        System.out.println("|     TIPO EMPLEADO     |");
        System.out.println("|_______________________|");                         
        System.out.println("|1. Administrativo      |");
        System.out.println("|2. Operario Técnico    |");
        System.out.println("|3. Operario No Técnico |");                        
        System.out.println("|_______________________|\n");
        Empleado=sc.nextByte();
    
         //Menú Administrativos
         if(Empleado==1){
            emp.actualizarDatos();
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
             emp.consultarDatos();
            System.out.println("Desea actualizar los datos?");
            System.out.println("1.Si                   2.No");
            int actuali=sc.nextInt();
               if(actuali==1){
               emp.actualizarDatos();
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
                 emp.consultarLiquiVacaciones();
                  break;
               case 5:
                 emp.consultarLiquiNomina();
                  break;
            }
         }while (opcion!=0);
      }
         
        //Menú Operativos Tec
         else if(Empleado==2){ 
            emp.actualizarDatos();
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
         emp.actualizarDatos();
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
   

