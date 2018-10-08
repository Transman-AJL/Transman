package Model;
// Generated Oct 8, 2018 7:21:03 PM by Hibernate Tools 4.3.1



/**
 * Documentacao generated by hbm2java
 */
public class Documentacao  implements java.io.Serializable {


     private int iddocumentacao;
     private String tipo;
     private String dataEmissao;
     private String dataFim;

    public Documentacao() {
    }

	
    public Documentacao(int iddocumentacao) {
        this.iddocumentacao = iddocumentacao;
    }
    public Documentacao(int iddocumentacao, String tipo, String dataEmissao, String dataFim) {
       this.iddocumentacao = iddocumentacao;
       this.tipo = tipo;
       this.dataEmissao = dataEmissao;
       this.dataFim = dataFim;
    }
   
    public int getIddocumentacao() {
        return this.iddocumentacao;
    }
    
    public void setIddocumentacao(int iddocumentacao) {
        this.iddocumentacao = iddocumentacao;
    }
    public String getTipo() {
        return this.tipo;
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getDataEmissao() {
        return this.dataEmissao;
    }
    
    public void setDataEmissao(String dataEmissao) {
        this.dataEmissao = dataEmissao;
    }
    public String getDataFim() {
        return this.dataFim;
    }
    
    public void setDataFim(String dataFim) {
        this.dataFim = dataFim;
    }




}


