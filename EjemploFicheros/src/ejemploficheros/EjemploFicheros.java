package ejemploficheros;

import com.miriam.lectura.LeerFichero;
import com.miriam.lectura.LeerNumeros;
import com.miriam.lectura.LeerObjetos;
import com.miriam.lectura.LeerPalabras;
import escritura.EscribirFichero;
import java.io.IOException;

public class EjemploFicheros {

    public static void main(String[] args) throws IOException {
        LeerFichero obx = new LeerFichero();
        //obx.leerLineas();

        LeerPalabras obx1 = new LeerPalabras();
        // obx1.leerPalabras();

        LeerNumeros obx2 = new LeerNumeros();
        // obx2.leerNumeros();
        // obx2.sumaNumerosPares();

        LeerObjetos obx3 = new LeerObjetos();
        // obx3.leerObjetos();

        // System.out.println( obx3.listaSuspensos());
        EscribirFichero obx4 = new EscribirFichero();
        obx4.escribirFrases();
        obx4.añadirFrases();

    }

}
