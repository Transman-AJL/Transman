package Model;
/**
 *
 * @author Arley Bebe
 */
public class Bus extends Veiculo {
    private int lotacao;

    public int getLotacao() {
        return lotacao;
    }

    public void setLotacao(int lotacao) {
        this.lotacao = lotacao;
    }
    
    public Bus(String matricula, String marca, String modelo, int ano, double kilometragem, String status, Documentacao doc) {
        super(matricula, marca, modelo, ano, kilometragem, status, doc);
    }
}
