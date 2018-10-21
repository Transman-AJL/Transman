package Control;

import java.util.List;
import java.util.Vector;
import javax.swing.JOptionPane;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Classe genérica Controller. Classe que faz a gerenciamento do contolo -----
 * interface entre a base de dados e a aplicação
 *
 * @author POO_2018
 * @param <T>
 */
public class Controller<T> {

    /**
     * Fábrica de sessões, NOTA: Não instanciar outro objecto desse neste projeto
     * 
     */
    public static SessionFactory factory = new Configuration().configure().buildSessionFactory();

    /**
     * Lista dos funcioários que usaremos para trabalhar no programa
     */
    private Vector<T> dados; //aqui colocas o tipo em causa
    private Class<T> tipoClasse;

    /**
     * Construtor, é único e recebe um tipoClasse,
     */
    public Controller(Class<T> tipoClasse) {
        this.tipoClasse = tipoClasse;
        this.dados = new Vector();
        this.dados = actualizarLista();
    }

    /**
     * Salva ou atualiza os objectos na base de dados, independentemente do tipo em causa
     * 
     * @param objecto
     * @return
     */
    public boolean salvarOuAtualizar(Object objecto) {
        
        boolean funcionou = false;
        Session sessao = factory.openSession();
        sessao.beginTransaction();
        
        try {
            sessao.saveOrUpdate(objecto);
            sessao.getTransaction().commit();
            funcionou = true;
        } catch (Exception h) {
            funcionou = false;
//            JOptionPane.showMessageDialog(null, "Erro do hibernate: \n" + h);
        } finally {
            sessao.close();
            dados = actualizarLista();
        }
        return funcionou;
    }
    
    public boolean Actualizar(Object objecto){
    
        boolean funcionou = false;
        Session sessao = factory.openSession();
        Transaction t=sessao.beginTransaction();
        
        try {
            sessao.update(objecto);
            System.out.println("Passou");
            t.commit();
            funcionou = true;
        } catch (Exception h) {
            h.printStackTrace();
            //funcionou = false;
//            JOptionPane.showMessageDialog(null, "Erro do hibernate: \n" + h);
        } finally {
            sessao.close();
            dados = actualizarLista();
        }
        return funcionou;
    }

    /**
     * Exclusão de um determinado dado à nível lógico
     *
     * @param objecto
     * @return
     */
    public boolean excluir(T objecto) {
        return true;
    }

    /**
     * Atualiza a lista dos funcionários
     *
     * @return
     */
    private Vector<T> actualizarLista() {
        Vector<T> todosDados = new Vector<T>();
        Session sessao = factory.openSession();
        sessao.beginTransaction();

        for (T a : (List<T>) sessao.createCriteria(tipoClasse).list()) {
            todosDados.add(a);
        }

        sessao.getTransaction().commit();
        sessao.close();
        return todosDados;
    }

    public Vector<T> getDados() {
        return dados;
    }

    private void setDados(Vector<T> dados) {
        this.dados = dados;
    }


}
