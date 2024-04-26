class Vendedor extends Pessoa {
    private int matricula;

    public Vendedor(String nome, int matricula) {
        super(nome);
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public void mostrarNome() {
        System.out.println("Nome do Vendedor: " + nome);
    }

}
