package com.miriam.lectura;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import personas.Alumno;

public class LeerObjetos {

    Scanner sc;
    File fichero;
    ArrayList<Alumno> alum = new ArrayList();

    public void leerObjetos() {
        String linea;
        String[] lista = new String[2];
        Alumno al;
        try {
            sc = new Scanner(new File("/home/local/DANIELCASTELAO/mbacelofernandez/Escritorio/alumnos.txt"));

            while (sc.hasNextLine()) {
                linea = sc.nextLine();
                lista = new String[2];
                lista = linea.split(",");
                al = new Alumno(lista[0], Integer.parseInt(lista[1]));
                System.out.println(al);

            }
        } catch (FileNotFoundException ex) {
            System.out.println("erro1" + ex.getMessage());
        }
        sc.close();
    }

    public ArrayList listaSuspensos() {
        String linea;
        String[] lista = new String[2];
        ArrayList<Alumno> listaSuspensos = new ArrayList<Alumno>();
        Alumno al;

        try {
            sc = new Scanner(new File("/home/local/DANIELCASTELAO/mbacelofernandez/Escritorio/alumnos.txt"));

            while (sc.hasNextLine()) {
                linea = sc.nextLine();
                lista = new String[2];
                lista = linea.split(",");

                al = new Alumno(lista[0], Integer.parseInt(lista[1]));
                if (Integer.parseInt(lista[1]) < 5) {
                    listaSuspensos.add(new Alumno(lista[0], Integer.parseInt(lista[1])));
                }
            }
            sc.close();

        } catch (FileNotFoundException ex) {
            System.out.println("erro1" + ex.getMessage());
        }

        return listaSuspensos;
    }
}
