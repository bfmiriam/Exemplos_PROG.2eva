package exemploclaseabstracta;

public class ExemploClaseAbstracta {

    public static void main(String[] args) {
        //Poligono pol1 = new Poligono(); Poligono no se puede instanciar porque es abstracta
        Triangulo tr1 = new Triangulo(4F, 5F);
        Rectangulo rec1 = new Rectangulo(4F, 5F);

        tr1.acharArea();
        rec1.acharArea();
    }

}
