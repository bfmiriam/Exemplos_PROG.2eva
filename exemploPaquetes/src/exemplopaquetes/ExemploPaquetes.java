package exemplopaquetes;

import com.miriam.taller.Taller;
import com.miriam.venta.Ventas;

public class ExemploPaquetes {

    public static void main(String[] args) {
        Coches coche1 = new Coches("111k");
        Ventas coh1 = new Ventas(coche1, 12000, "Citroen");
        Taller coh2 = new Taller(coche1, 500f);

        System.out.println(coh1.toString());
        System.out.println(coh2.toString());

        coh2.costeArranxo("111k", coh1);
    }

}
