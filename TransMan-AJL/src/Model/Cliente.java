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
 * Nela encontramos os requisitos para cadastrar clintes e suas necessiddes.
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

    public Cliente(String nome, String nuit) {
        this.nome = nome;
        this.nuit = nuit;
    }

    public Cliente() {
    
    }
    
    
    /**
     * Metodo de adição do Identificador
     * @return 
     */
    public int getId() {
        return id;
    }
    /**
     * Metodo de Alteraçáo dos Identificadores dos clientes
     * @param id 
     */
    public void setId(int id) {
        this.id = id;
    }
    /**
     * Metedo de adição de Nome dos clientes(Sejam empresas ou individuais) 
     * @return 
     */
    public String getNome() {
        return nome;
    }
    /**
     * Metodo de Alteraçáo dos nome dos clientes
     * @param nome 
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
    /**
     * Metodo de adição de documento dos clientes
     * @return 
     */
    public String getNuit() {
        return nuit;
    }
    /**
     * Metodo de Alteração dos documentos dos Clientes
     * @param nuit 
     */
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
