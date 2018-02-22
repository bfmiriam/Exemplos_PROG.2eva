package exemploclaseabstracta;

public class Rectangulo extends Poligono {

    public Rectangulo(float base, float altura) {
        super(base, altura);
    }

    @Override
    public void acharArea() {
        System.out.println("Area Rectangulo = " + super.getBase() * super.getAltura());
    }

}
