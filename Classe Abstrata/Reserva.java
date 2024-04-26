import java.time.LocalDateTime;
import java.util.List;

class Reserva {
    private LocalDateTime dataCadastro;
    private Usuario usuario;
    private List<Livro> livros;

    public Reserva(LocalDateTime dataCadastro, Usuario usuario, List<Livro> livros) {
        this.dataCadastro = dataCadastro;
        this.usuario = usuario;
        this.livros = livros;
    }

    public LocalDateTime getDataCadastro() {
        return dataCadastro;
    }

    public List<Livro> getLivros() {
        return livros;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setDataCadastro(LocalDateTime dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public void setLivros(List<Livro> livros) {
        this.livros = livros;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}