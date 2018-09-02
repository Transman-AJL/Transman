
package Model;

/**
 *
 * @author lipe
 */
public class Camiao extends Veiculo{
    private String tipo;

    public Camiao(String tipo, String matricula, String marca, String modelo, int ano, double kilometragem, String status, String categoria, String Tipo, double peso, double volume, int lotacao, double cilindrada) {
        super(matricula, marca, modelo, ano, kilometragem, status, categoria, Tipo, peso, volume, lotacao, cilindrada);
        this.tipo = tipo;
    }
    
   

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
}
