package exemploclasesobxectos;

public class Rato {

    private Mouse rato;

    public Rato() {
    }

    public Rato(Mouse rato) {
        this.rato = rato;
    }

    public Mouse getRato() {
        return rato;
    }

    public void setRato(Mouse rato) {
        this.rato = rato;
    }

    @Override
    public String toString() {
        return "Rato => " + "tipo: " + rato + "\n";
    }

}
