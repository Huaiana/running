public class Corrida {
    private Cliente cliente;
    private Motorista motorista;
    private Automovel veiculo;
    private String origem;
    private String destino;
    private Double valor;

public Corrida(Cliente cliente, Motorista motorista, Automovel veiculo,
     String origem, String destino, Double valor) {
        this.cliente = cliente;
        this.motorista = motorista;
        this.veiculo = veiculo;
        this.origem = origem;
        this.destino = destino;
        this.valor = valor;
     }

public Cliente getCliente() { return cliente; }    
public void setCliente(Cliente cliente) { this.cliente = cliente; } 

public Motorista getMotorista() { return motorista; }
public void setMotorista(Motorista motorista) { this.motorista = motorista;}

public Automovel getVeiculo() { return veiculo; }
public void setVeiculo(Automovel veiculo) { this.veiculo = veiculo; }

public String getOrigem() { return origem; }
public void setOrigem(String origem) { this.origem = origem; }

public String getDestino() { return destino; }
public void setDestino(String destino) { this.destino = destino; }

public double getValor() {return valor; } 
public void setValor(double valor) { this.valor = valor; }

  
    //mostrar as ligações completas dos objetos
public void exibirDetalhesCorrida() {
    System.out.println("====== CORRIDA ======");
    System.out.println("Cliente: " + cliente.getNome());
    System.out.println("Motorista: " + motorista.getNome() + " (CNH: " + motorista.getCnh() +")");
    System.out.println("Veiculo: " +  veiculo.getFabricante() + " " + veiculo.getModelo() + " | Placa: " + veiculo.getPlaca());
    System.out.println("Trajeto: " + origem + " -> " + destino);
    System.out.println("Valor: R$ " + valor);
    System.out.println("==============================");
  }

}
