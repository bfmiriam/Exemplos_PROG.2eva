package exemploclasesobxectos;

public class Cpu {

    private int memoria;
    private int velocidade;

    public Cpu() {
    }

    public Cpu(int memoria, int velocidade) {
        this.memoria = memoria;
        this.velocidade = velocidade;
    }

    public int getMemoria() {
        return memoria;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    @Override
    public String toString() {
        return "Cpu => " + "memoria: " + memoria + " velocidade: " + velocidade + "\n";
    }

}
