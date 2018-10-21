package Model;

import Control.Controller;
import java.util.Vector;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author Arley Bebe
 */
@Entity
/**
 * Criação da classe Veiculo
 */
public class Veiculo {
    
    @Id
    @GeneratedValue
    /**
     * criando variáveies da classe Veículo
     */
    private int id;
    private String matricula;
    private String marca;
    private String modelo;
    private int ano;
    private double kilometragem;
    private String status;
    private String categoria;
    private String tipo;
    private double peso;
    private int lotacao;
    private double volume;
    //private Documentacao doc;

    /**
     * criação do metodo construtor da classe Veículo
     * @param matricula
     * @param marca
     * @param modelo
     * @param ano
     * @param kilometragem 
     */
    public Veiculo(String matricula, String marca, String modelo, int ano, double kilometragem) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.kilometragem = kilometragem;
        this.status = "Disponivel";
    }

    public Veiculo(){
    
    }
    /**
     * Metodo que recebe a matriculoa do veículo
     * @return 
     */
    public String getMatricula() {
        return matricula;
    }

    /**
     * Matodod que recebe o Identificador do veículo
     * @return 
     */
    public int getId() {
        return id;
    }

    /**
     * Metodod de alteração da matriculoa dos veículos
     * @param id 
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Metodo que recebe as catregorias dos veículos
     * @return 
     */
    public String getCategoria() {
        return categoria;
    }
    /**
     * Metodo de alteração da categoria dos veículos
     * @param categoria 
     */
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    /**
     * Metodo que recebe os Tipos dos Veículos
     * @return 
     */
    public String getTipo() {
        return tipo;
    }
    /**
     * Metodo de alteração do tipo de veículo
     * @param tipo 
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * Metodo que recebe o peso do veículo
     * @return 
     */
    public double getPeso() {
        return peso;
    }
    /**
     * Metodo de alteração do peso dos veículos
     * @param peso 
     */
    public void setPeso(double peso) {
        this.peso = peso;
    }

    /**
     * Metodo que recebe a lotação dos veículos
     * @return 
     */
    public int getLotacao() {
        return lotacao;
    }
    /**
     * Metodo de  alteração da lotação dos veículos
     * @param lotacao 
     */
    public void setLotacao(int lotacao) {
        this.lotacao = lotacao;
    }

    /**
     * Metodoque recebe o Volume dos veículos do tipo Tanque
     * @return 
     */
    public double getVolume() {
        return volume;
    }
    /**
     * Metodo de alteração do volume dos veículos do tipo Tanque
     * @param volume 
     */
    public void setVolume(double volume) {
        this.volume = volume;
    }
    
    /**
     * Metodo de alteração da matricula dos veículos
     * @param matricula 
     */
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    /***
     * Metodo que recebe a marca dos veículos
     * @return 
     */
    public String getMarca() {
        return marca;
    }

    /**
     * Metodo de alteração da marca dos veiculos
     * @param marca 
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * Metodo que recebe o modelo dos veículos
     * @return 
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * Metodo de lalteração do modelo dos veículos
     * @param modelo 
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * Metodo que recebe o  ano de fabrico dos veículos
     * @return 
     */
    public int getAno() {
        return ano;
    }

    /**
     * Metodo de alteração do ano de fabrico dos veículos
     * @param ano 
     */
    public void setAno(int ano) {
        this.ano = ano;
    }

    /**
     * metodo que recebe a kilometragem dos veículos
     * @return 
     */
    public double getKilometragem() {
        return kilometragem;
    }
    /**
     * Metodo de alteração da kilometragem inicial do veículo na sua aquisição dos veículos
     * @param kilometragem 
     */
    public void setKilometragem(double kilometragem) {
        this.kilometragem = kilometragem;
    }

    /**
     * Metodo que reebe o estado dos veículos
     * @return 
     */
    public String getStatus() {
        return status;
    }

    /**
     * Metodo de alteração do estado dos veículos 
     * @param status 
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /*public Documentacao getDoc() {
        return doc;
    }

    public void setDoc(Documentacao doc) {
        this.doc = doc;
    }*/
    
    public boolean gravar(){
        
        Controller <Veiculo>v=new Controller<Veiculo>(Veiculo.class);
        return v.salvarOuAtualizar(this);
    
    }
    
}
