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
public class Funcionario {
    
    @Id
    @GeneratedValue
    private int id;
    private String nome;
    private Date DataNascimento;
    private Date DataAdmissao;
    private String funcao;
    private String numBI;
    private String status;

    public Funcionario(String nome, Date DataNascimento, Date DataAdmissao, String funcao, String numBI, String status) {
        this.nome = nome;
        this.DataNascimento = DataNascimento;
        this.DataAdmissao = DataAdmissao;
        this.funcao = funcao;
        this.numBI = numBI;
        this.status = status;
    }
    
    public int getCodigo() {
        return id;
    }

    public void setCodigo(int codigo) {
        this.id = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataNascimento() {
        return DataNascimento;
    }

    public void setDataNascimento(Date DataNascimento) {
        this.DataNascimento = DataNascimento;
    }

    public Date getDataAdmissao() {
        return DataAdmissao;
    }

    public void setDataAdmissao(Date DataAdmissao) {
        this.DataAdmissao = DataAdmissao;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public String getNumBI() {
        return numBI;
    }

    public void setNumBI(String numBI) {
        this.numBI = numBI;
    }

    public String setStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
}
