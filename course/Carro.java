public class Carro extends Automovel {
    private int quantidadeDePortas;

    public Carro(String modelo, String placa, String fabricante, String ano, String quantidadeDePortas) {
        super(modelo, placa, fabricante, ano, "");
        this.quantidadeDePortas = Integer.parseInt(quantidadeDePortas);
    }

    public int getQuantidadeDePortas() { return quantidadeDePortas; }
    public void setQuantidadeDePortas(int quantidadeDePortas) { 
        this.quantidadeDePortas = quantidadeDePortas; }

}
