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
public class Veiculo {
    
    @Id
    @GeneratedValue
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
    
    public String getMatricula() {
        return matricula;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getLotacao() {
        return lotacao;
    }

    public void setLotacao(int lotacao) {
        this.lotacao = lotacao;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getKilometragem() {
        return kilometragem;
    }

    public void setKilometragem(double kilometragem) {
        this.kilometragem = kilometragem;
    }

    public String getStatus() {
        return status;
    }

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
    
    public boolean actualizar(){
        
        Controller<Veiculo>c=new Controller<Veiculo>(Veiculo.class);
        return c.Actualizar(this);
    
    }
    
}
