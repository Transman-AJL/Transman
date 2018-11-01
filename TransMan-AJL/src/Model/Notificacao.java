package Model;

import Control.Controller;
import java.util.Date;

/**
 *
 * @author User
 */
public class Notificacao {
   
    private int id;
    private Date data;
    private int idViagem;
    private String descricao;

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public int getIdViagem() {
        return idViagem;
    }

    public void setIdViagem(int idViagem) {
        this.idViagem = idViagem;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Notificacao(Date data, int idViagem, String descricao) {
        this.data = data;
        this.idViagem = idViagem;
        this.descricao = descricao;
    }

    public Notificacao() {
    
    }
    
    public boolean gravar(){
        
        Controller <Notificacao>c=new Controller<Notificacao>(Notificacao.class);
        return c.salvarOuAtualizar(this);
    
    }
    
}
