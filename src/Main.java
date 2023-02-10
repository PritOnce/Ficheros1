import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Introduce texto para añadir al documento." +"\n" + "Para salir introduczca Salir");
        try(FileWriter fw = new FileWriter("datos.txt",true);PrintWriter pw = new PrintWriter(fw)){
            Scanner sc = new Scanner(System.in);
            String añadir = sc.nextLine();
            while (!añadir.equalsIgnoreCase("Salir")){
                pw.println(añadir);
                añadir = sc.nextLine();
            }
        }catch (FileNotFoundException E){
            System.out.println(E.getMessage());
        }
    }
}