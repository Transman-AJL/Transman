package Model;
/**
 *
 * @author Arley Bebe
 */
public class Veiculo {
    private String matricula;
    private String marca;
    private String modelo;
    private int ano;
    private double kilometragem;
    private String status;
    private Documentacao doc;

    public Veiculo(String matricula, String marca, String modelo, int ano, double kilometragem, String status, Documentacao doc) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.kilometragem = kilometragem;
        this.status = status;
        this.doc = doc;
    }

    public String getMatricula() {
        return matricula;
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

    public Documentacao getDoc() {
        return doc;
    }

    public void setDoc(Documentacao doc) {
        this.doc = doc;
    }
    
    
}
