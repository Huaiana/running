public class Usuario {
    String nome;
    String email;
    String senha;
    String cpf;
    String contato;

    public Usuario(String nome, String email, String senha, String cpf, String contato) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.cpf = cpf;
        this.contato = contato;

    }

    public String getNome() { return nome; }
    public String getEmail() { return email; }
    public String getSenha() { return senha; }
    public String getCpf() { return cpf; }
    public String getContato() { return contato; }
}
