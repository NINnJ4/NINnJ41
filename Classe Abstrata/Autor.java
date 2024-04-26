import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Autor {
    private String nome;
    private String curriculumResumido;

    public Autor(String nome, String curriculumResumido) {
        this.nome = nome;
        this.curriculumResumido = curriculumResumido;
    }

    public String getNome() {
        return nome;
    }

    public String getCurriculumResumido() {
        return curriculumResumido;
    }

    public void setCurriculumResumido(String curriculumResumido) {
        this.curriculumResumido = curriculumResumido;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void mostrarNome() {
        System.out.println("Nome do Autor: " + nome);
    }
}