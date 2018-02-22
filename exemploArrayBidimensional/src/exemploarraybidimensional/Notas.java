package exemploarraybidimensional;

import javax.swing.JOptionPane;

public class Notas {

    int[][] notas = new int[4][3];
    int[] medias = new int[notas.length];

    public void crearTaboa() {
        for (int f = 0; f < notas.length; f++) {
            for (int c = 0; c < notas[f].length; c++) {
                notas[f][c] = Integer.parseInt(JOptionPane.showInputDialog("nota "));
            }
        }

    }

    public void amosar() {

        for (int f = 0; f < notas.length; f++) {
            System.out.print("| ");
            for (int c = 0; c < notas[f].length; c++) {
                System.out.print(notas[f][c] + "  ");
            }
            System.out.println("|\n");
        }
    }

    //media de las filas
    public void mediaAlumno() {
        int acu, f, c;
        for (f = 0; f < notas.length; f++) {
            acu = 0;
            for (c = 0; c < notas[f].length; c++) {
                acu = acu + notas[f][c];

            }
            System.out.println("media= " + acu / notas[f].length);
        }
    }

    public int[] mediaAlumno2() {
        int acu, f, c;
        // int[] medias = new int[notas.length];
        for (f = 0; f < notas.length; f++) {
            acu = 0;

            for (c = 0; c < notas[f].length; c++) {
                acu = acu + notas[f][c];

            }
            medias[f] = acu / notas[f].length;
        }
        return medias;
    }

    //media de las columnas
    public void mediaModulo() {
        int acu, f, c;
        int[] mediasModulos = new int[notas.length];
        for (c = 0; c < notas[0].length; c++) {
            acu = 0;

            for (f = 0; f < notas.length; f++) {
                acu = acu + notas[f][c];
            }
            System.out.print(acu / notas.length + " ,");
            mediasModulos[c] = acu / notas.length;
        }
    }

    public void ordenar() {

        int i, j, k, aux1 = 0, aux2 = 0;
        for (i = 0; i < medias.length - 1; i++) {
            for (j = i + 1; j < medias.length;) {
                if (medias[i] > medias[j]) {
                    aux1 = medias[i];
                    medias[i] = medias[j];
                    medias[j] = aux1;
                    for (k = 0; k < notas[0].length; k++) {
                        aux2 = notas[i][k];
                        notas[i][k] = notas[j][k];
                        notas[j][k] = aux2;
                    }
                }

            }
        }
    }

}
