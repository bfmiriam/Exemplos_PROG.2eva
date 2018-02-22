package exemploclaseabstracta;

public abstract class Poligono {

    private float base;
    private float altura;

    public Poligono(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }

    public float getBase() {
        return base;
    }

    public float getAltura() {
        return altura;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public abstract void acharArea();
}
