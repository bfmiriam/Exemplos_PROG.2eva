package com.miriam.lectura;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LeerNumeros {

    Scanner sc;
    File ficheiro;

    public void leerNumeros() {
        ficheiro = new File("/home/local/DANIELCASTELAO/mbacelofernandez/Escritorio/numeros.txt");
        try {
            sc = new Scanner(ficheiro).useDelimiter("\\s*,\\s*");
            while (sc.hasNextInt()) {

                System.out.println(sc.nextInt());
            }
        } catch (FileNotFoundException ex) {
            System.out.println("erro1" + ex.getMessage());
        }
        sc.close();
    }

    public void sumaNumerosPares() {
        int suma = 0;
        ficheiro = new File("/home/local/DANIELCASTELAO/mbacelofernandez/Escritorio/numeros.txt");
        try {
            sc = new Scanner(ficheiro).useDelimiter("\\s*,\\s*");
            while (sc.hasNextInt()) {
                int num = sc.nextInt();
                if ((num % 2) == 0) {
                    suma = suma + num;
                }
            }
            System.out.println("suma de pares" + suma);

        } catch (FileNotFoundException ex) {
            System.out.println("erro1" + ex.getMessage());
        }
        sc.close();
    }

}
