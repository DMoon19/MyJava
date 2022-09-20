public class Operativos extends Empleados {
 
    String workplacePlanta, descripcionLabor, 
    cursosRealizados, oficioPlanta, 
    curso1, curso2, curso3, curso4, curso5, curso6, curso7, curso8, curso9;


    protected void consultarCursos(){
      System.out.print("-"+cursosRealizados);
    }
    protected void ActualizarCursos(){
      

         System.out.print("Qué cursos ha realizado?");
         cursosRealizados=sc.next();

      //  if(count==1){
      //      String curso1=cursosRealizados;
      //  }
      //  else if(count==2){
      //      String curso2=cursosRealizados;
      //  }
      //  else if(count==3){
      //      String curso3=cursosRealizados;
      //  }
      //  else if(count==4){
      //      String curso4=cursosRealizados;
      //  }
      //  else if(count==5){
      //      String curso5=cursosRealizados;
      //  }
      //  else if(count==6){
      //      String curso6=cursosRealizados;
      //  }
      //  else if(count==7){
      //      String curso7=cursosRealizados;
      //  }
      //  else if(count==8){
      //      String curso8=cursosRealizados;
      //  }
      //  else if(count==9){
      //      String curso9=cursosRealizados;
      //  }
        
    }
    protected void consultarDescripcion(){
        System.out.println("Curso #1: "+curso1);
        if(curso2!=null && curso3 !=null){
        System.out.println("Curso #2: "+curso2);
        System.out.println("Curso #3: "+curso3);
        }
        if(curso4!=null && curso5 !=null){
        System.out.println("Curso #4: "+curso4);
        System.out.println("Curso #5: "+curso5);
        }
        else if(curso6!=null && curso7 !=null){
        System.out.println("Curso #6: "+curso6);
        System.out.println("Curso #7: "+curso7);
        }
        else if(curso6!=null && curso7 !=null){
        System.out.println("Curso #8: "+curso8);
        System.out.println("Curso #9: "+curso9);
        }
    }
    protected void actualizarDescripcion(){
        System.out.println("Qué labor desempeña:");

    }
}
