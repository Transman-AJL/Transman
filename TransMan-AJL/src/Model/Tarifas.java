/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Control.Controller;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author JoseM
 */
/**
 * Classe Tarifas
 * @author lipe
 */
@Entity
public class Tarifas {
    /**
     * Criação das variáveis da classe Tarifas
     */
    @Id
    @GeneratedValue
    private int id;
    private double precoKM;
    private double precoKGAberto;
    private double precoKGFechado;
    private double precoKGFrigorifico;
    private double precoAlojamento;
    private double precoAlimentacao;
    private double precoMotorista;
    private double precoEstivador;
    private double precoCombustivel;
    private double precoTanque;
    private double precoAutomovel;
    private double precoBus;
    private double precoBasculante;
    private double precoPortaContentor;
    private Date dataAlteracao;

    public Tarifas() {
    
        this.dataAlteracao=new Date();
    }

    public Tarifas(double precoKM, double precoKGAberto, double precoKGFechado, double precoKGFrigorifico, double precoAlojamento, double precoAliementacao, double precoMotorista, double precoEstivador, double precoCombustivel, double precoPassageiro, double precoAutomovel, double precoBus, double precoBasculante, double precoPortaContentor) {
        
        this();
        
        this.precoKM = precoKM;
        this.precoKGAberto = precoKGAberto;
        this.precoKGFechado = precoKGFechado;
        this.precoKGFrigorifico = precoKGFrigorifico;
        this.precoAlojamento = precoAlojamento;
        this.precoAlimentacao = precoAliementacao;
        this.precoMotorista = precoMotorista;
        this.precoEstivador = precoEstivador;
        this.precoCombustivel = precoCombustivel;
        this.precoTanque = precoPassageiro;
        this.precoAutomovel = precoAutomovel;
        this.precoBus = precoBus;
        this.precoBasculante = precoBasculante;
        this.precoPortaContentor = precoPortaContentor;
    }
    
    public double getPrecoKM() {
        return precoKM;
    }

    public void setPrecoKM(double precoKM) {
        this.precoKM = precoKM;
    }

    public double getPrecoKGAberto() {
        return precoKGAberto;
    }

    public void setPrecoKGAberto(double precoKGAberto) {
        this.precoKGAberto = precoKGAberto;
    }

    public double getPrecoKGFechado() {
        return precoKGFechado;
    }

    public void setPrecoKGFechado(double precoKGFechado) {
        this.precoKGFechado = precoKGFechado;
    }

    public double getPrecoKGFrigorifico() {
        return precoKGFrigorifico;
    }

    public void setPrecoKGFrigorifico(double precoKGFrigorifico) {
        this.precoKGFrigorifico = precoKGFrigorifico;
    }

    public double getPrecoAlojamento() {
        return precoAlojamento;
    }

    public void setPrecoAlojamento(double precoAlojamento) {
        this.precoAlojamento = precoAlojamento;
    }

    public double getPrecoAliementacao() {
        return precoAlimentacao;
    }

    public void setPrecoAliementacao(double precoAliementacao) {
        this.precoAlimentacao = precoAliementacao;
    }

    public double getPrecoMotorista() {
        return precoMotorista;
    }

    public void setPrecoMotorista(double precoMotorista) {
        this.precoMotorista = precoMotorista;
    }

    public double getPrecoEstivador() {
        return precoEstivador;
    }

    public void setPrecoEstivador(double precoEstivador) {
        this.precoEstivador = precoEstivador;
    }

    public double getPrecoCombustivel() {
        return precoCombustivel;
    }

    public void setPrecoCombustivel(double precoCombustivel) {
        this.precoCombustivel = precoCombustivel;
    }

    public double getPrecoAlimentacao() {
        return precoAlimentacao;
    }

    public void setPrecoAlimentacao(double precoAlimentacao) {
        this.precoAlimentacao = precoAlimentacao;
    }

    public double getPrecoTanque() {
        return precoTanque;
    }

    public void setPrecoTanque(double precoTanque) {
        this.precoTanque = precoTanque;
    }


    public double getPrecoAutomovel() {
        return precoAutomovel;
    }

    public void setPrecoAutomovel(double precoAutomovel) {
        this.precoAutomovel = precoAutomovel;
    }

    public double getPrecoBus() {
        return precoBus;
    }

    public void setPrecoBus(double precoBus) {
        this.precoBus = precoBus;
    }

    public double getPrecoBasculante() {
        return precoBasculante;
    }

    public void setPrecoBasculante(double precoBasculante) {
        this.precoBasculante = precoBasculante;
    }

    public double getPrecoPortaContentor() {
        return precoPortaContentor;
    }

    public void setPrecoPortaContentor(double precoPortaContentor) {
        this.precoPortaContentor = precoPortaContentor;
    }

    public Date getDataAlteracao() {
        return dataAlteracao;
    }

    public void setDataAlteracao(Date dataAlteracao) {
        this.dataAlteracao = dataAlteracao;
    }
    
    public boolean gravar(){
        Controller <Usuario>u=new Controller<Usuario>(Usuario.class);
        return u.salvarOuAtualizar(this);
    }
    
    
    
    
}
