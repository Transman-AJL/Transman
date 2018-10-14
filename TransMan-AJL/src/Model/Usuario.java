package Model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author User
 */
@Entity
public class Usuario {
    
    @Id
    @GeneratedValue
    private int id;
    private String nome;
    private String senha;
    private Date dataUltimoLog;
    
}
