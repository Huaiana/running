/**
 * Moto
 */
public class Moto extends Automovel {
    //Atrubuti para Moto
private int cilindradas;

public Moto(String modelo, String placa, String fabricante, String ano, String litros, int cilindradas) {
    //enviar os atributos comuns para a classe pai (Automovel)
    super(modelo, placa, fabricante, ano, litros);
    this.cilindradas = cilindradas;
 }
public int getCilinddradaas() {
    return cilindradas;
 }
public void setCilindradas(int cilindradas) {
    this.cilindradas = cilindradas;
 }
}
