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
public class Usuario {
    
    @Id
    @GeneratedValue
    private int id;
    private String nome;
    private String senha;
    private Date dataUltimoLog;
    private String tipo;
    
    public Usuario(){
    
        this.dataUltimoLog=new Date();
    }
    
    public Usuario(String nome, String password, String tipo){
        this();
        this.nome=nome;
        this.senha=password;
        this.tipo=tipo;
    }

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

    public String getNome() {
        return nome;
    }

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
