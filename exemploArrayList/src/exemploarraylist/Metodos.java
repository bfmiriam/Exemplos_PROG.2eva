package exemploarraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import javax.swing.JOptionPane;

public class Metodos {

    static int mayor;
    static int menor;

    public void engadir(ArrayList<Integer> lis) {
        Integer n;
        n = Integer.parseInt(JOptionPane.showInputDialog("numero"));
        lis.add(n);
        //Fai o mesmo que o anterior
        // lis.add(Integer.parseInt(JOptionPane.showInputDialog("numero")));    
    }

    public void amosarIterator(ArrayList<Integer> lis) {

        Iterator it = lis.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }

    public void borrarElementoPosicion(ArrayList<Integer> lis) {
        int posicion = Integer.parseInt(JOptionPane.showInputDialog("Que posicion deseas borrar?"));
        lis.remove(posicion - 1);
//          for (int i = 0; i < lis.size(); i++) {
//            System.out.println(lis.get(i));
//            if(i==posicion-1){
//                lis.remove(i);
//            }
//            
//        }
// 

    }

    public void borrarElemento(ArrayList<Integer> lis) {
        int elemento = Integer.parseInt(JOptionPane.showInputDialog("Que elemento deseas borrar?"));
        lis.remove(new Integer(elemento));

//        for (int i = 0; i < lis.size(); i++) {
//            System.out.println(lis.get(i));
//            if(lis.get(i)==elemento){
//                lis.remove(i);
//            }
//        }
    }

    //mudar valor por posicion
    public void mudarValorPosicion(ArrayList<Integer> lis) {

        int posicion = Integer.parseInt(JOptionPane.showInputDialog("Que posicion deseas modificar?"));
        int valor = Integer.parseInt(JOptionPane.showInputDialog("Novo valor"));
        lis.set(posicion, valor);

    }

    //mudar valor
    public void mudarValor(ArrayList<Integer> lis) {
        int valorAnt = Integer.parseInt(JOptionPane.showInputDialog("Que elemento deseas modificar?"));
        int valorNovo = Integer.parseInt(JOptionPane.showInputDialog("Cal é o novo valor?"));
        int posicion = lis.indexOf(valorAnt);
        lis.set(posicion, valorNovo);
    }

    //mostrar mayor y menor
    public void mostrarMayorYMenor(ArrayList<Integer> lis) {
        Comparator<? super Integer> c = null;
        lis.sort(c);
        mayor = lis.get(lis.size() - 1);
        menor = lis.get(0);
        System.out.println("mayor: " + mayor + " menor: " + menor);
    }

    //mostrar los pares de la lista
    public ArrayList<Integer> mostrarPares(ArrayList<Integer> lis) {

        Iterator it = lis.iterator();
        ArrayList<Integer> pares = new ArrayList<Integer>();
        while (it.hasNext()) {
            int num = ((int) it.next());
            if ((num % 2) == 0) {
                pares.add(num);
            }
        }
        return pares;
    }
}
