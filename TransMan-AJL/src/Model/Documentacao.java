package Model;
import Control.Controller;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
/**
 *
 * @author Arley Bebe
 */
@Entity
/**
 * Classe Documentação
 */
public class Documentacao {
    //Seguro
    /**
     * Criando Identificadores para a classe Documentação
     */
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
    
    public boolean gravar(){
        
        Controller <Documentacao>d=new Controller<Documentacao>(Documentacao.class);
        return d.salvarOuAtualizar(this);
    
    }
    
    
    
}
