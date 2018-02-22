package escritura;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class EscribirFichero {

    File fichero;
    PrintWriter escribir;

    public void escribirFrases() {
        try {
            fichero = new File("frases.txt");
            escribir = new PrintWriter(fichero);
//            tambien se puede hacer asi:
//             escribir = new PrintWriter(new File("frases2.txt"));
            escribir.println("primeira frase");
//            escribir.println("segunda frase");
            escribir.println("tercera frase");
            escribir.close();
        } catch (FileNotFoundException ex) {
            System.out.println("erro de escritura");
        }
    }

    public void añadirFrases() throws IOException {
        try {
            fichero = new File("frases2.txt");
            escribir = new PrintWriter(new FileWriter(fichero, true));
//          FileWriter fich= new FileWriter(new File("frases2.txt"),true);
            escribir.println("Hola");
            //escribir.println("Que tal?");
            escribir.println("primeira frase");
            escribir.write("chao");
            escribir.write("dgfdf");
        } catch (FileNotFoundException ex) {
            System.out.println("erro de escritura");

        } finally {
            escribir.close();
        }
    }
}
