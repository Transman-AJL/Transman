package Model;

import Control.Controller;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author User
 */
/**
 * Classe Usuario
 * @author lipe
 */
@Entity
public class Usuario {
    
    @Id
    @GeneratedValue
    /**
     * declaração das variáeis da classe Usuario
     */
    private int id;
    private String nome;
    private String senha;
    private Date dataUltimoLog;
    private String tipo;
    
    /**
     * Metodo para o Registo do ultimo Acesso a aplicação
     */
    public Usuario(){
    
        this.dataUltimoLog=new Date();
    }
    /**
     * Metodo construtor da classe Usuário
     * @param nome
     * @param password
     * @param tipo 
     */
    public Usuario(String nome, String password, String tipo){
        this();
        this.nome=nome;
        this.senha=password;
        this.tipo=tipo;
    }

    /**
     * Metodo de Criação dos Identificadores dos Usuarios
     * @return 
     */
    public int getId() {
        return id;
    }

    /**
     * Metodo de alteração do codigo de Identificação dos Usuarios
     * @param id 
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Metodo de Criação do tipo de Usuario
     * @return 
     */
    public String getTipo() {
        return tipo;
    }
    /**
     * Metodo de alteração do Tipo de0 Usuario
     * @param tipo 
     */

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * Metodo de Criação de Nomes dos Usuarios
     * @return 
     */
    public String getNome() {
        return nome;
    }

    /**
     * Metodo de alteração do Nome dos Usuarios
     * @param nome 
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Metodo de Criação de Senhas de acesso para os Usuarios
     * @return 
     */
    public String getSenha() {
        return senha;
    }

    /***
     * Metodo de alteração das senhas dos Usuarios
     * @param senha 
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }
 /**
  * Metodo de registo da data do ultimo acesso dos Usuarios
  * @return 
  */
    public Date getDataUltimoLog() {
        return dataUltimoLog;
    }

    /***
     * Metodo de alteração do registo da ultima data de acesso dos Usuarios
     * @param dataUltimoLog 
     */
    public void setDataUltimoLog(Date dataUltimoLog) {
        this.dataUltimoLog = dataUltimoLog;
    }
    
    public boolean gravar(){
        
        Controller <Usuario>u=new Controller<Usuario>(Usuario.class);
        return u.salvarOuAtualizar(this);
    
    }
    
    public boolean actualizar(){
        
        Controller<Usuario>u=new Controller<Usuario>(Usuario.class);
        return u.Actualizar(this);
    
    }
    
}
