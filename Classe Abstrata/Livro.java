import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Livro {
    private Integer codigo;
    private String titulo;
    private List<Autor> autores;

    public Livro(Integer codigo, String titulo, List<Autor> autores) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.autores = autores;
    }

    public List<Autor> getAutores() {
        return autores;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setAutores(List<Autor> autores) {
        this.autores = autores;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
