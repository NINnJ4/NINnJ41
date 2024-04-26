import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Autor georgeOrwell = new Autor("George Orwell", "Pseudônimo de Eric Arthur Blair.");
        Autor jkRowling = new Autor("J.K. Rowling", "Escritora britânica de Harry Potter.");
        Autor stephenKing = new Autor("Stephen King", "Escritor de terror e ficção científica.");
        Autor agathaChristie = new Autor("Agatha Christie", "Escritora britânica de romances policiais.");
        Autor jorgeAmado = new Autor("Jorge Amado", "Escritor brasileiro de Gabriela, Cravo e Canela.");

        List<Autor> autores = new ArrayList<>();
        autores.add(georgeOrwell);
        autores.add(jkRowling);
        autores.add(stephenKing);
        autores.add(agathaChristie);
        autores.add(jorgeAmado);

        List<Livro> listaLivros = new ArrayList<>();
        Livro livro1 = new Livro(1, "1984", autores);
        Livro livro2 = new Livro(2, "Harry Potter e a Pedra Filosofal", autores);
        Livro livro3 = new Livro(3, "It: A Coisa", autores);
        Livro livro4 = new Livro(4, "O Assassinato no Expresso Oriente", autores);
        Livro livro5 = new Livro(5, "Dona Flor e Seus Dois Maridos", autores);
        listaLivros.add(livro1);
        listaLivros.add(livro2);
        listaLivros.add(livro3);
        listaLivros.add(livro4);
        listaLivros.add(livro5);

        List<Pessoa> pessoas = new ArrayList<>();
        Vendedor vendedor = new Vendedor("Eldimar Soares", 123);
        Usuario usuario = new Usuario("Marcos Augusto", "marcos.sales@escola.pr.gov.br", 98765432109L);
        pessoas.add(vendedor);
        pessoas.add(usuario);

        System.out.println("Vendedor " + vendedor.getNome() + ": Bem-vindo! Aqui está a lista de livros disponíveis:");
        for (int i = 0; i < listaLivros.size(); i++) {
            Livro livro = listaLivros.get(i);
            System.out.println((i + 1) + ". " + livro.getTitulo());
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print(vendedor.getNome() + " : Por favor, digite o número do livro que deseja reservar: ");
        int escolha = scanner.nextInt();
        if (escolha >= 1 && escolha <= listaLivros.size()) {
            Livro livroEscolhido = listaLivros.get(escolha - 1);
            Reserva reserva = new Reserva(LocalDateTime.now(), usuario, List.of(livroEscolhido));
            System.out.println(vendedor.getNome() + " : Reserva efetuada com sucesso do livro \"" + livroEscolhido.getTitulo() + "\" por " + usuario.getNome() + ".");
        } else {
            System.out.println(vendedor.getNome() + " : Opção inválida. Por favor, escolha um número de livro válido.");
        }
    }
}
