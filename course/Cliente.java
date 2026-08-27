public class Cliente extends Usuario {
   
    private String endereco;
    

public Cliente(String nome, String email, String senha, String cpf, String contato, String endereco) {
    super(nome, email, senha, cpf, contato);
    this.endereco = endereco;
}

    public String getEndereco() { return endereco; }
}
