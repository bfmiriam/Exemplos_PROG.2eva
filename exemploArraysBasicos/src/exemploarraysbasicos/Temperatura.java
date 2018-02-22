package exemploarraysbasicos;

import javax.swing.JOptionPane;

public class Temperatura {

    public void amosar(float[] temp) {
        for (int i = 0; i < temp.length; i++) {
            System.out.println("temperatura" + (i + 1) + "---->" + temp[i]);
        }
    }

    public void temperaturaDeterminada(float[] temp, int posicion) {

        while (posicion < 1 || posicion > temp.length) {
            posicion = Integer.parseInt(JOptionPane.showInputDialog("posicion"));
        }
        System.out.println("a temperatura = " + temp[posicion - 1]);
    }

    public void buscarElemento(float[] temp, float tempBuscar) {

        boolean atopado = false;
        for (int i = 0; i < temp.length; i++) {
            if (tempBuscar == temp[i]) {
                System.out.println("posicion=" + (i + 1));
                atopado = true;
            }
        }
        if (atopado == false) {
            System.out.println(tempBuscar + "non está");
        }
    }

    public void ordenar(float[] temp) {
        int i, j;
        float aux;
        for (i = 0; i < temp.length - 1; i++) {
            for (j = i + 1; j < temp.length; j++) {
                if (temp[i] > temp[j]) {
                    aux = temp[i];
                    temp[i] = temp[j];
                    temp[j] = aux;

                }
            }
        }

    }
}
