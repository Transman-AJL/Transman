
package Model;

/**
 *
 * @author lipe
 */
    public class Bus extends Veiculo {
    private int lotacao;

    public int getLotacao() {
        return lotacao;
    }

    public void setLotacao(int lotacao) {
        this.lotacao = lotacao;
    }

    public Bus(int lot, String matricula, String marca, String modelo, int ano, double kilometragem, String status, String categoria, String Tipo, double peso, double volume, int lotacao, double cilindrada) {
        super(matricula, marca, modelo, ano, kilometragem, status, categoria, Tipo, peso, volume, lotacao, cilindrada);
        this.lotacao = lot;
    }
    
   
}
