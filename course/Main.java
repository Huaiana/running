public class Main {
public static void main (String[] args) {
    Cliente cliente = new Cliente("nome", "email", "senha", "cpf", "(11) 98888-8888", "Rua maginolia, 28");
    Motorista motorista = new Motorista("motorista", "email", "senha", "cpf", "123456789", "B");
    String endereço = "Rua maginolia, 28";
    String destino = "Avenida Paulista, 1000";
    Double valor = 25.0;

    //instancionado veiculos (polimorfismo: Carro e Moto são Automoveis)
    Carro carro = new Carro("modelo", "BRA6E85", "fabricante", "2026", "4");
    Moto moto = new Moto("CG 160", "BRA38KL", "fabricante", "2026", "16", 160);

 //Corrida 1: Carro
 Corrida corridaCarro = new Corrida(cliente, motorista, carro, endereço, destino, valor);
 corridaCarro.exibirDetalhesCorrida();

 //Corrida 2: Moto
 Corrida corridaMoto = new Corrida(cliente, motorista, moto, endereço, destino, valor);
 corridaMoto.exibirDetalhesCorrida();
 
  }
}
