package exemploclasesobxectos;

public class Mouse {

    private String tipo;

    public Mouse() {
    }

    public Mouse(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Mouse => " + "tipo: " + tipo;
    }

}
