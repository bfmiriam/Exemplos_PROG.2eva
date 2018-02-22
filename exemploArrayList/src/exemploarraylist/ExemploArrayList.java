package exemploarraylist;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ExemploArrayList {

    public static void main(String[] args) {

        ArrayList lista = new ArrayList();
        lista.add(1);
        lista.add("aaa");
        lista.add(1.6);
        lista.add('d');

        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }

        ArrayList<Integer> listaNum = new ArrayList();
//        listaNum.add(2);
//        listaNum.add(new Integer(3));
        //non admite String 
        //listaNum.add("palabra");

        Metodos obx1 = new Metodos();
        int op;

        do {
            System.out.println("-----MENU-----\n1)Añadir elemento a la lista\n2)Visualizar\n3)Salir\n"
                    + "4)Borrar posicion\n5)Borrar elemento\n6)Mudar valor posicion\n7)Mudar valor\n"
                    + "8)Mostrar mayor y menor\n9)Mostrar pares");

            op = Integer.parseInt(JOptionPane.showInputDialog("Escoge una opcion"));

            switch (op) {
                case 1:
                    obx1.engadir(listaNum);
                    break;
                case 2:
                    obx1.amosarIterator(listaNum);
                    break;
                case 3:
                    break;
                case 4:
                    obx1.borrarElementoPosicion(listaNum);
                    break;
                case 5:
                    obx1.borrarElemento(listaNum);
                    break;
                case 6:
                    obx1.mudarValorPosicion(listaNum);
                    break;
                case 7:
                    obx1.mudarValor(listaNum);
                    break;
                case 8:
                    obx1.mostrarMayorYMenor(listaNum);
                    break;
                case 9:
                    ArrayList<Integer> pares = new ArrayList<Integer>();
                    pares = obx1.mostrarPares(listaNum);
                    obx1.amosarIterator(pares);

                    break;
                default:
                    System.out.println("A opcion escollida non é valida");
            }

        } while (op != 3);

    }
}
