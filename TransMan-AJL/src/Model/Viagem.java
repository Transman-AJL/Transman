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
    private String tipo;

    public Viagem() {
    }
    

    public Viagem(String localPartida, String provinciaPartida, String localDestino, String provinciaDestino, Date dataRegisto, Date dataPartida, Date dataChegada, int numMotoristas, String estado, double distancia, String matriculaVeiculo, double consumoCombustivel, double tempoEstimado, double ValorAlimentacao, double valorAlojamento, double precoTotal, String nomeUsuario, String nomeCliente) {
        this.localPartida = localPartida;
        this.provinciaPartida = provinciaPartida;
        this.localDestino = localDestino;
        this.provinciaDestino = provinciaDestino;
        this.dataRegisto = dataRegisto;
        this.dataPartida = dataPartida;
        this.dataChegada = dataChegada;
        this.numMotoristas = numMotoristas;
        this.estado = estado;
        this.distancia = distancia;
        this.matriculaVeiculo = matriculaVeiculo;
        this.consumoCombustivel = consumoCombustivel;
        this.tempoEstimado = tempoEstimado;
        this.ValorAlimentacao = ValorAlimentacao;
        this.valorAlojamento = valorAlojamento;
        this.precoTotal = precoTotal;
        this.nomeUsuario = nomeUsuario;
        this.nomeCliente = nomeCliente;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLocalPartida() {
        return localPartida;
    }

    public void setLocalPartida(String localPartida) {
        this.localPartida = localPartida;
    }

    public String getProvinciaPartida() {
        return provinciaPartida;
    }

    public void setProvinciaPartida(String provinciaPartida) {
        this.provinciaPartida = provinciaPartida;
    }

    public String getLocalDestino() {
        return localDestino;
    }

    public void setLocalDestino(String localDestino) {
        this.localDestino = localDestino;
    }

    public String getProvinciaDestino() {
        return provinciaDestino;
    }

    public void setProvinciaDestino(String provinciaDestino) {
        this.provinciaDestino = provinciaDestino;
    }

    public Date getDataRegisto() {
        return dataRegisto;
    }

    public void setDataRegisto(Date dataRegisto) {
        this.dataRegisto = dataRegisto;
    }

    public double getValorAlojamento() {
        return valorAlojamento;
    }

    public void setValorAlojamento(double valorAlojamento) {
        this.valorAlojamento = valorAlojamento;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }
    
    public boolean gravar(){
        
        Controller <Viagem>v=new Controller<Viagem>(Viagem.class);
        return v.salvarOuAtualizar(this);
    
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
    public boolean actualizar(){
        
        Controller<Viagem>c=new Controller<Viagem>(Viagem.class);
        return c.Actualizar(this);
    
    }
    
}
