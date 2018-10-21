package Model;

import Control.Controller;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author Arley Bebe
 */
@Entity
/**
 * Classe Cliente.
 * nelaencontramos os requisitos para cadastrar clintes e suas necessiddes.
 */
public class Cliente {
    /**
     * crinado chave primaria 
     */
    @Id
    @GeneratedValue
    private int id;
    private String nome;
    private String nuit;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNuit() {
        return nuit;
    }

    public void setNuit(String nuit) {
        this.nuit = nuit;
    }
    
    /**
     * Metodo construtor Que permite gravar os clientes a serem registados
     * @return 
     */
    public boolean gravar(){
        
        Controller <Cliente>c=new Controller<Cliente>(Cliente.class);
        return c.salvarOuAtualizar(this);
    
    }
}
