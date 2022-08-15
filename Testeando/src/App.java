import java.util.Scanner;
public class App {

 
	static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) throws Exception {
        System.out.print("Hello, World!\n ~Write down your name~");
        String str_Name=sc.nextLine();
        System.out.println("Which Language are'y using");
        String str_Language=sc.nextLine();

        System.out.print("Hi its "+str_Name+" and here is my first project with "+str_Language+" on my workspace outside CS");

    }
}
