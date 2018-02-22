package com.miriam.lectura;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LeerPalabras {

    Scanner sc;
    File ficheiro;

    public void leerPalabras() {

        ficheiro = new File("/home/local/DANIELCASTELAO/mbacelofernandez/Escritorio/primero.txt");
        try {
            sc = new Scanner(ficheiro).useDelimiter("\\s*,\\s*");
            while (sc.hasNext()) {

                System.out.println(sc.next());
            }
        } catch (FileNotFoundException ex) {
            System.out.println("erro1" + ex.getMessage());
        }
        sc.close();
    }

}
