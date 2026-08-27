public class Motorista extends Usuario {
    private String cnh;
    private String categoriaCnh;
      //repasando os dados do usuario para o super()
    public Motorista(String nome, String email, String senha, String cpf, String cnh, String categoriaCnh) {
        super(nome, email, senha, cpf, "");
        this.cnh = cnh;
        this.categoriaCnh = categoriaCnh;
    }
    public String getCnh() { return cnh; }
    public void setCnh(String cnh) { this.cnh = cnh; }    

    public String getCategoria() { return categoriaCnh; }
    public void setCategoriaCnh(String categoriaCnh) { this.categoriaCnh = categoriaCnh; }
    
}
