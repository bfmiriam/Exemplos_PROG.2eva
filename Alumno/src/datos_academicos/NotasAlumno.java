package datos_academicos;

public class NotasAlumno {
    private String nome;
    protected float nota;

    public NotasAlumno() {
    }

    public NotasAlumno(String nome, float nota) {
        this.nome = nome;
        this.nota = nota;
    }

    public String getNome() {
        return nome;
    }

    public float getNota() {
        return nota;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "\nNota: " + nota;
    }
    
}
