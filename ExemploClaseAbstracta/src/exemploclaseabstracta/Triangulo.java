package exemploclaseabstracta;

public class Triangulo extends Poligono {

    public Triangulo(float base, float altura) {
        super(base, altura);
    }

    @Override
    public void acharArea() {
        System.out.println("Area Triangulo = " + this.getBase() * super.getAltura() / 2);
    }

}
