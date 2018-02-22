package metodosxenericos;

import java.util.ArrayList;

public class MetodosXenericos {

    public static void main(String[] args) {
        ArrayList<Pantalla> lisPan = new ArrayList<>();
        ArrayList<Mouse> lisRato = new ArrayList<>();
        ArrayList<String> lisNomes = new ArrayList<>();

        // Metodos obx = new Metodos();
        lisPan.add(new Pantalla("samsung", 17f));
        lisPan.add(new Pantalla("asus", 17.5f));
        lisPan.add(new Pantalla("samsung", 20f));
        lisRato.add(new Mouse("inalambrico"));
        lisRato.add(new Mouse("con cable"));
        lisNomes.add("Noa");
        lisNomes.add("Alba");
        lisNomes.add("Manuel");
        lisNomes.add("Natalia");
        lisNomes.add("Sara");

        Metodos.amosar(lisPan);
        Metodos.amosar(lisRato);
        Metodos.amosar(lisNomes);
//      
//      Metodos.eliminarPosicion(lisPan);
//      Metodos.amosar(lisPan);

        Metodos.eliminarElemento(lisPan);
        Metodos.amosar(lisPan);

    }

}
