package Model;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author lipe
 */
@Entity
public class Viagem {
    
    @Id
    @GeneratedValue
    private int id;
    private String partida;
    private String destino;
    private Date dataPartida;
    private Date dataChegada;
    private int numMotoristas;
    private String tipo;
    private String estado;
    private int idCliente;
    private double distancia;
    private String matriculaVeiculo;
    private double consumoCombustivel;
    private double tempoEstimado;
    private double ValorAlimentacao;
    private double valorlojamento;
    private double precoTotal;

    public String getPartida() {
        return partida;
    }

    public void setPartida(String partida) {
        this.partida = partida;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
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
        return valorlojamento;
    }

    public void setValorlojamento(double valorlojamento) {
        this.valorlojamento = valorlojamento;
    }

    public double getPrecoTotal() {
        return precoTotal;
    }

    public void setPrecoTotal(double precoTotal) {
        this.precoTotal = precoTotal;
    }
    
    
}
