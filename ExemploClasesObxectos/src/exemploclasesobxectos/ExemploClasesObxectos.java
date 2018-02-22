package exemploclasesobxectos;

public class ExemploClasesObxectos {

    public static void main(String[] args) {

        Cpu c = new Cpu(2000, 1000);
        Pantalla p = new Pantalla("Philips", 15.5f);
        Rato r = new Rato(new Mouse("con cable"));
        Ordenador orde1 = new Ordenador(c, p, r);
        System.out.println(orde1.toString());

        Ordenador orde2 = new Ordenador(new Cpu(2500, 2000),
                new Pantalla("Samsung", 17.2f), new Rato(new Mouse("inalambrico")));
        System.out.println(orde2.toString());

        //c.setVelocidade(5000);
        //System.out.println(orde1.toString());
        orde1.getProcesador().setVelocidade(5000);
        System.out.println(orde1.toString());

        System.out.println(orde2.getPantalla().getMarca());

        Ordenador orde3 = new Ordenador();

        System.out.println(orde3.toString());

        orde3.getProcesador().setVelocidade(3000);
        orde3.getProcesador().setMemoria(1500);
        orde3.getPantalla().setMarca("ASUS");
        orde3.getPantalla().setPulgadas(13.2f);
        orde3.getRato().getRato().setTipo("sen cables");

        System.out.println(orde3.toString());

    }

}
