package datos_academicos;

public class BoletinNotas {
    public void amosarNotas(){
        NotasAlumno aux = new NotasAlumno();
        System.out.println("Nome: "+aux.getNome());
        System.out.println("Nota: "+aux.nota);
    }
}
