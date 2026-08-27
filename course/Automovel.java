public class Automovel {
    private String modelo;
    private String placa;
    private String fabricante;
   private String ano;
   private String capacidadeTanqueLitros;
    private String tipoCombustivel;
    private String cor;

       public Automovel(String modelo, String placa, String fabricante, String ano,
          String capacidadeTanqueLitros) {
            this.modelo = modelo;
            this.placa = placa;
                this.fabricante = fabricante;
            this.ano = ano;
                this.capacidadeTanqueLitros = capacidadeTanqueLitros;
         }

             public String getModelo() { return modelo; }
             public String getPlaca() { return placa; }
             public String getFabricante() { return fabricante; }
             public String getAno() { return ano; }
             public String getCapacidadeTanqueLitros() { return capacidadeTanqueLitros; }
             public String getTipoCombustivel() { return tipoCombustivel; }
             public String getCor() { return cor; }
}
