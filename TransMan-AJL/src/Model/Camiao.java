package Model;
/**
 *
 * @author Arley Bebe
 */
public class Camiao extends Veiculo {

    private String tipo;
    
    public Camiao(String matricula, String marca, String modelo, int ano, double kilometragem, String status, Documentacao doc) {
        super(matricula, marca, modelo, ano, kilometragem, status, doc);
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
}
