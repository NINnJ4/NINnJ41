class Usuario extends Pessoa {
    private String email;
    private long cpf;

    public Usuario(String nome, String email, long cpf) {
        super(nome);
        this.email = email;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public void mostrarNome() {
        System.out.println("Nome do Usuário: " + nome);
    }
}