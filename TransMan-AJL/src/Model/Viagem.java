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
public class Viagem {
    
    @Id
    @GeneratedValue
    private int id;
    private String localPartida;
    private String provinciaPartida;
    private String localDestino;
    private String provinciaDestino;
    private Date dataRegisto;
    private Date dataPartida;
    private Date dataChegada;
    private int numMotoristas;
    private String estado;
    private double distancia;
    private String matriculaVeiculo;
    private double consumoCombustivel;
    private double tempoEstimado;
    private double ValorAlimentacao;
    private double valorAlojamento;
    private double precoTotal;
    private String nomeUsuario;
    private String nomeCliente;

    
    public Date getDataPartida() {
        return dataPartida;
    }

    public void setDataPartida(Date dataPartida) {
        this.dataPartida = dataPartida;
    }

    public Date getDataChegada() {
        return dataChegada;
    }

    public void setDataChegada(Date dataChegada) {
        this.dataChegada = dataChegada;
    }

    public int getNumMotoristas() {
        return numMotoristas;
    }

    public void setNumMotoristas(int numMotoristas) {
        this.numMotoristas = numMotoristas;
    }


    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public String getMatriculaVeiculo() {
        return matriculaVeiculo;
    }

    public void setMatriculaVeiculo(String matriculaVeiculo) {
        this.matriculaVeiculo = matriculaVeiculo;
    }

    public double getConsumoCombustivel() {
        return consumoCombustivel;
    }

    public void setConsumoCombustivel(double consumoCombustivel) {
        this.consumoCombustivel = consumoCombustivel;
    }

    public double getTempoEstimado() {
        return tempoEstimado;
    }

    public void setTempoEstimado(double tempoEstimado) {
        this.tempoEstimado = tempoEstimado;
    }

    public double getValorAlimentacao() {
        return ValorAlimentacao;
    }

    public void setValorAlimentacao(double ValorAlimentacao) {
        this.ValorAlimentacao = ValorAlimentacao;
    }

    public double getValorlojamento() {
        return valorAlojamento;
    }

    public void setValorlojamento(double valorlojamento) {
        this.valorAlojamento = valorlojamento;
    }

    public double getPrecoTotal() {
        return precoTotal;
    }

    public void setPrecoTotal(double precoTotal) {
        this.precoTotal = precoTotal;
    }
    
    public boolean gravar(){
        
        Controller <Viagem>v=new Controller<Viagem>(Viagem.class);
        return v.salvarOuAtualizar(this);
    
    }
    
}
