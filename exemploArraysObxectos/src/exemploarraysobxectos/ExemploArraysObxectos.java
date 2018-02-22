package exemploarraysobxectos;

import java.util.Arrays;
import javax.swing.JOptionPane;

public class ExemploArraysObxectos {

    public static void main(String[] args) {
        Persoa[] persoas = new Persoa[4];
        String nome, dni;
        MetodosArray obxMetodos = new MetodosArray();
//       for(int i=0;i<persoas.length;i++){
//           nome=JOptionPane.showInputDialog("nome");
//           dni=JOptionPane.showInputDialog("dni");
//           persoas[i] = new Persoa(nome,dni);
//           
//       }
        Persoa[] listaPersoas = {new Persoa("aa", "77458961y"), new Persoa("bb", "778542568o")};
        obxMetodos.amosar(listaPersoas);
        //persoas=obxMetodos.crearArray();

        Arrays.sort(listaPersoas);
        obxMetodos.amosar(listaPersoas);
    }

}
