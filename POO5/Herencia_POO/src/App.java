import Herencia.Estudiante;

public class App {
    public static void main(String[] args) throws Exception {
        Estudiante estudiante=new Estudiante("David", "Garcia",
         19, 418873, 5.0f);

        estudiante.mostrarDatos();
    }
}
