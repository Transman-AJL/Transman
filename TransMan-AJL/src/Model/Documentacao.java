package Model;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
/**
 *
 * @author Arley Bebe
 */
@Entity
public class Documentacao {
    //Seguro
    @Id
    @GeneratedValue
    private int id;
    private Date EmissaoSeg;
    private Date FimSeg;
    //Inspensao
    private Date EmissaoIns;
    private Date FimIns;
    //Manifesto
    private Date EmissaoMan;
    private Date FimMan;
    //Radio
    private Date EmissaoRad;
    private Date FimRad;
    //Manutencao
    private Date EmissaoMant;
    private Date FimMant;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getEmissaoSeg() {
        return EmissaoSeg;
    }

    public void setEmissaoSeg(Date EmissaoSeg) {
        this.EmissaoSeg = EmissaoSeg;
    }

    public Date getFimSeg() {
        return FimSeg;
    }

    public void setFimSeg(Date FimSeg) {
        this.FimSeg = FimSeg;
    }

    public Date getEmissaoIns() {
        return EmissaoIns;
    }

    public void setEmissaoIns(Date EmissaoIns) {
        this.EmissaoIns = EmissaoIns;
    }

    public Date getFimIns() {
        return FimIns;
    }

    public void setFimIns(Date FimIns) {
        this.FimIns = FimIns;
    }

    public Date getEmissaoMan() {
        return EmissaoMan;
    }

    public void setEmissaoMan(Date EmissaoMan) {
        this.EmissaoMan = EmissaoMan;
    }

    public Date getFimMan() {
        return FimMan;
    }

    public void setFimMan(Date FimMan) {
        this.FimMan = FimMan;
    }

    public Date getEmissaoRad() {
        return EmissaoRad;
    }

    public void setEmissaoRad(Date EmissaoRad) {
        this.EmissaoRad = EmissaoRad;
    }

    public Date getFimRad() {
        return FimRad;
    }

    public void setFimRad(Date FimRad) {
        this.FimRad = FimRad;
    }

    public Date getEmissaoMant() {
        return EmissaoMant;
    }

    public void setEmissaoMant(Date EmissaoMant) {
        this.EmissaoMant = EmissaoMant;
    }

    public Date getFimMant() {
        return FimMant;
    }

    public void setFimMant(Date FimMant) {
        this.FimMant = FimMant;
    }
    
    
}
