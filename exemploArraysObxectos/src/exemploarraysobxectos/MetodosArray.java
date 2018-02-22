package exemploarraysobxectos;

import javax.swing.JOptionPane;

public class MetodosArray {

    public void amosar(Persoa[] listaPersoas) {
        for (Persoa elemento : listaPersoas) {
            System.out.println(elemento);
        }
    }

    public Persoa[] crearArray() {
        String nome, dni;
        Persoa[] lista = new Persoa[4];
        for (int i = 0; i < lista.length; i++) {
            nome = JOptionPane.showInputDialog("nome");
            dni = JOptionPane.showInputDialog("dni");
            lista[i] = new Persoa(nome, dni);
        }
        return lista;

    }

    public Persoa buscar(Persoa[] liPersoas, String dni) {

        boolean atopado = false;//non atopado
        Persoa per = new Persoa();
        for (int i = 0; i < liPersoas.length; i++) {
            if (dni.equalsIgnoreCase(liPersoas[i].getDni())) {
                //System.out.println("DNI encontrado");
                atopado = true;
                per = liPersoas[i];
            }
        }
        if (atopado == false) {
            System.out.println("non se atopou");
        }
        return per;
    }
}
