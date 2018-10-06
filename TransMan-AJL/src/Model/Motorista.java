/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Date;

/**
 *
 * @author Arley Bebe
 */
public class Motorista extends Funcionario{
    //dados da carta de conducao
    private String categoria;
    private Date dataEmissao;
    private Date dataFim;
    private int numCarta;
    
    public Motorista(int codigo, String nome, Date DataNascimento, Date DataAdmissao, String funcao, int numBI, boolean status) {
        super(codigo, nome, DataNascimento, DataAdmissao, funcao, numBI, status);
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Date getDataEmissao() {
        return dataEmissao;
    }

    public void setDataEmissao(Date dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    public Date getDataFim() {
        return dataFim;
    }

    public void setDataFim(Date dataFim) {
        this.dataFim = dataFim;
    }

    public int getNumCarta() {
        return numCarta;
    }

    public void setNumCarta(int numCarta) {
        this.numCarta = numCarta;
    }
    
    
    
}
