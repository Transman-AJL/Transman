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
 * Classe Funcionário
 */
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
    //private Documentacao documentacao;

    /*public Documentacao getDocumentacao() {
        return documentacao;
    }*/

    /*public void setDocumentacao(Documentacao documentacao) {
        this.documentacao = documentacao;
    }*/

    /**
     * Metodo construtor para gravar funcionário
     * @return 
     */
    public Funcionario(String nome, Date DataNascimento, Date DataAdmissao, String funcao, String numBI, String status) {
        this.nome = nome;
        this.DataNascimento = DataNascimento;
        this.DataAdmissao = DataAdmissao;
        this.funcao = funcao;
        this.numBI = numBI;
        this.status = status;
    }
    public Funcionario(){}
    /**
     * Metodo de  criação dos Identificadores dos Funcionários
     * @return 
     */
    public int getCodigo() {
        return id;
    }
    /**
     * Metodo de alteração de codigo dos Funcionários
     * @param codigo 
     */
    public void setCodigo(int codigo) {
        this.id = codigo;
    }
    /**
     * Metodo de criação de nome do Funcionário
     * @return 
     */
    public String getNome() {
        return nome;
    }
    /**
     * Metodo de alteração do nome dos Funcionários
     * @param nome 
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
    /**
     * Metodo de criação da data de nascimento dos Funcionário
     * @return 
     */
    public Date getDataNascimento() {
        return DataNascimento;
    }
    /**
     * Metodo de alteração da data de Nescimento dos Funcionários
     * @param DataNascimento 
     */
    public void setDataNascimento(Date DataNascimento) {
        this.DataNascimento = DataNascimento;
    }
    /**
     *  Metodo de criação da data de admissão dos Funcionário
     * @return 
     */
    public Date getDataAdmissao() {
        return DataAdmissao;
    }
    /**
     * Metodo de alteração da data de Admissão dos Funcionários
     * @param DataAdmissao 
     */
    public void setDataAdmissao(Date DataAdmissao) {
        this.DataAdmissao = DataAdmissao;
    }
    /**
     * Metodo de criação da Função dos Funcionário
     * @return 
     */
    public String getFuncao() {
        return funcao;
    }
    /**
     * Metodo de alteração da Função dos Funcionários
     * @param funcao 
     */
    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }
    /**
     * Metodo de criação dos Documentos de identifição dos Funcionário
     * @return 
     */
    public String getNumBI() {
        return numBI;
    }
    /**
     * Metodo de alteração do numero de Documento dos Funcionários
     * @param numBI 
     */
    public void setNumBI(String numBI) {
        this.numBI = numBI;
    }
    /**
     * Metodo de criação do estado dos Funcionário
     * @return 
     */
    public String setStatus() {
        return status;
    }
    /**
     * Metodo de alteração do Estado dos Funcionários
     * @param status 
     */
    public void setStatus(String status) {
        this.status = status;
    }
    
    
    public boolean gravar(){
        
        Controller <Funcionario>f=new Controller<Funcionario>(Funcionario.class);
        return f.salvarOuAtualizar(this);
    
    }
    
}
