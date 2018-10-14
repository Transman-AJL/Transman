package Model;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
/**
 *
 * @author Arley Bebe
 */
@Entity
public class Documentacao {
    //Seguro
    @Id
    @GeneratedValue
    private int id;
    private String tipo;
    private Date DataEmissao;
    private Date DataFim;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Date getDataEmissao() {
        return DataEmissao;
    }

    public void setDataEmissao(Date DataEmissao) {
        this.DataEmissao = DataEmissao;
    }

    public Date getDataFim() {
        return DataFim;
    }

    public void setDataFim(Date DataFim) {
        this.DataFim = DataFim;
    }
    
    
    
    
}
