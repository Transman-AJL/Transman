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
@Entity
/**
 * Classe Usuario
 */
public class Usuario {
    
    @Id
    @GeneratedValue
    /**
     * Criação das variaveis da classe Usuario
     */
    private int id;
    private String nome;
    private String senha;
    private Date dataUltimoLog;
    private String tipo;
    
    public Usuario(){
    
        this.dataUltimoLog=new Date();
    }
    /**
     * Cricçãao do metodo construtor da classe Usuario
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
     * Metodo que recebe o coddigo de identificação dos usuarios
     * @return 
     */
    public int getId() {
        return id;
    }

    /**
     * Metodo de alteraçao do codigo de identificaçáo dos ususarios
     * @param id 
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Metodo que recebe o Tipo de usuario
     * @return 
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Metodo de alteracao do tipo de usuario
     * @param tipo 
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * Metodod que recebe o nome dos usuarios
     * @return 
     */
    public String getNome() {
        return nome;
    }

    /**
     * Metodod de alteração do Nome dos usuarios     
     * @param nome 
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Metodo que recebe as Senhas dod usuarios
     * @return 
     */
    public String getSenha() {
        return senha;
    }

    /**
     * Metodo de alteração da ssenha dos usuários
     * @param senha 
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }

    /**
     * Metodo que recebe a data do ultimo acceso ao sistema
     * @return 
     */
    public Date getDataUltimoLog() {
        return dataUltimoLog;
    }

    /**
     * Metodo de alteração do ultimo acesso a aplicação
     * @param dataUltimoLog 
     */
    public void setDataUltimoLog(Date dataUltimoLog) {
        this.dataUltimoLog = dataUltimoLog;
    }
    /**
     * 
     * @return 
     */
    public boolean gravar(){
        
        Controller <Usuario>u=new Controller<Usuario>(Usuario.class);
        return u.salvarOuAtualizar(this);
    
    }
    
    public boolean actualizar(){
        
        Controller<Usuario>u=new Controller<Usuario>(Usuario.class);
        return u.Actualizar(this);
    
    }
    
}
