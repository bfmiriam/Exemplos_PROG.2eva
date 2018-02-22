package exemplopaquetes;

public class Coches {

    private String matricula;

    public Coches() {
    }

    public Coches(String matricula) {
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Coches{" + "matricula=" + matricula + '}';
    }

}
