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

    /**
     * Criando Identificadores dos veículos
     * @return 
     */
    public int getId() {
        return id;
    }
    /**
     * Metodo de Alteracao de Identificador dos veículos
     * @param id 
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * 
     * @return 
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Metodo de Alteracao do Tipo de Veículo.
     * @param tipo 
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * Ccrindo data de Emisao dos Docuementos
     * @return 
     */
    public Date getDataEmissao() {
        return DataEmissao;
    }

    /**
     * Metodo de alteração da data de Emissao dos documentos
     * @param DataEmissao 
     */
    public void setDataEmissao(Date DataEmissao) {
        this.DataEmissao = DataEmissao;
    }

    /**
     * Adicionando data de fim(prazo) do documento dos veículos
     * @return 
     */
    public Date getDataFim() {
        return DataFim;
    }

    /**
     * Metodo de alteração da data de Fim(Prazo) dos documentos
     * @param DataFim 
     */
    public void setDataFim(Date DataFim) {
        this.DataFim = DataFim;
    }
    /**
     * Metodo costrutor para gravar a Docuentação dos veículos
     * @return 
     */
    public boolean gravar(){
        
        Controller <Documentacao>d=new Controller<Documentacao>(Documentacao.class);
        return d.salvarOuAtualizar(this);
    
    }
    
    
    
}
