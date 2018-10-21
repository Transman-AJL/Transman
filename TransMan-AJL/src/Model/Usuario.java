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
    /**
     * Criando identificador da classe usuario
     */
    @Id
    @GeneratedValue
    /**
     * Crindo Variáveis da classe Usuario
     * 
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
     * Metodo Construtor da classe Usuario
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

    public int getId() {
        return id;
    }

    /**
     * Metodo que recebe o Identificador da classe
     * @param id 
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Metodo que recebe o tipo de usuario 
     * @return 
     */
    public String getTipo() {
        return tipo;
    }
    /**
     * Metodo de alteração do tipo de usuario
     * @param tipo 
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    /**
     * Metodo que recebe o nome dos usuarios
     * @return 
     */
    public String getNome() {
        return nome;
    }

    /***
     * Matodo que recebe
     * @param nome 
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Date getDataUltimoLog() {
        return dataUltimoLog;
    }

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
