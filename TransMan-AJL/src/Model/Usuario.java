package Model;
// Generated Oct 6, 2018 5:25:52 PM by Hibernate Tools 4.3.1



/**
 * Usuario generated by hbm2java
 */
public class Usuario  implements java.io.Serializable {


     private String idusuario;
     private String password;
     private String dataUltimoLog;
     private String horaUltimoLog;

    public Usuario() {
    }

	
    public Usuario(String idusuario, String password) {
        this.idusuario = idusuario;
        this.password = password;
    }
    public Usuario(String idusuario, String password, String dataUltimoLog, String horaUltimoLog) {
       this.idusuario = idusuario;
       this.password = password;
       this.dataUltimoLog = dataUltimoLog;
       this.horaUltimoLog = horaUltimoLog;
    }
   
    public String getIdusuario() {
        return this.idusuario;
    }
    
    public void setIdusuario(String idusuario) {
        this.idusuario = idusuario;
    }
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    public String getDataUltimoLog() {
        return this.dataUltimoLog;
    }
    
    public void setDataUltimoLog(String dataUltimoLog) {
        this.dataUltimoLog = dataUltimoLog;
    }
    public String getHoraUltimoLog() {
        return this.horaUltimoLog;
    }
    
    public void setHoraUltimoLog(String horaUltimoLog) {
        this.horaUltimoLog = horaUltimoLog;
    }




}


