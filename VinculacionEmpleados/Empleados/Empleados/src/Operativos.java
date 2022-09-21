public class Operativos extends Empleados {
 
    String workplacePlanta, descripcionLabor, 
    cursosRealizados, oficioPlanta, 
    curso1, curso2, curso3, curso4, curso5, curso6, curso7, curso8, curso9;


    protected void consultarCursos(){
      System.out.println("Cursos Realizados");
      System.out.println("Curso #1: "+curso1);
          if(curso2!=null && curso3 !=null){
          System.out.println("Curso #2: "+curso2);
          System.out.println("Curso #3: "+curso3);
          }
          else if(curso4!=null && curso5 !=null){
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
    protected void actualizarCursos(){ //No me da xd
      
        for(int i=0;i<10;i=i+1){
          System.out.println("Qué cursos ha realizado?");
          cursosRealizados=sc.next();
          
          curso1=cursosRealizados;
          if(cursosRealizados==curso1){
            cursosRealizados="";
          }
          else{curso2=cursosRealizados;
            if(cursosRealizados==curso2){
              cursosRealizados="";
            }
            else{curso3=cursosRealizados;
            if(cursosRealizados==curso3){
              cursosRealizados="";
            }
            else{curso4=cursosRealizados;
              if(cursosRealizados==curso4){
                cursosRealizados="";
              }
              else{curso5=cursosRealizados;
                if(cursosRealizados==curso5){
                  cursosRealizados="";
                }
                else{curso6=cursosRealizados;
                  if(cursosRealizados==curso6){
                    cursosRealizados="";
                  }
                  else{curso7=cursosRealizados;
                    if(cursosRealizados==curso7){
                      cursosRealizados="";
                    }
                    else{curso8=cursosRealizados;
                      if(cursosRealizados==curso8){
                        cursosRealizados="";
                      }
                      else{curso9=cursosRealizados;
                        if(cursosRealizados==curso9){
                          cursosRealizados="";}
                        }
                      }
                    }
                  }
                }
              }
            }    
          }
          System.out.println("\nCurso #1: "+curso1);
          if(curso2!=null && curso3 !=null){
          System.out.println("Curso #2: "+curso2);
          System.out.println("Curso #3: "+curso3);
          }
          else if(curso4!=null && curso5 !=null){
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
          System.out.println("Desea agregar otro curso?");
          System.out.println("1.Si                 2.No");
          byte course=sc.nextByte();
          if(course==1){
       i++;
          }else if(course==2){
            i=10;
          }else{System.out.println("Error");
        }}
         
        
         
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
    	if(workplacePlanta!=null) {
    		System.out.println("Su zona de trabajo es "+workplacePlanta);	
    		System.out.println("Su cargo es el de "+oficioPlanta);
    		System.out.println("Lo que hace como "+oficioPlanta+"en el"+workplacePlanta+" es:\n\n"+descripcionLabor);
    	}else {
    		System.out.println("Su zona de trabajo no ha sido ingresada, por favor ingresela:");
    		actualizarDescripcion();
    	}
    	
    }
    protected void actualizarDescripcion(){
    	System.out.println("\nEn que zona de la planta en la que trabaja?");
    	workplacePlanta=sc.next();
        System.out.println("Qué oficio desempeña en la "+workplacePlanta+"?");
        oficioPlanta=sc.next();
        System.out.println("Qué labores realiza como "+oficioPlanta+"?");
        descripcionLabor=sc.next();
    
    
    }
}
